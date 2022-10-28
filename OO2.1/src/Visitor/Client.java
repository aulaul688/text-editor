package Visitor;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        String inputContent = "i am happy12. we are herqwe";
        CheckList checkList = new ConcreteCheckList(inputContent);
        Iterator iterator = checkList.getIterator();

        while (iterator.hasNext()) {
            String val = iterator.next();
            List<Dict> list = DictionaryObjectStruct.getList();

            for (Dict e : list) {
                boolean sendWord = e.accept(new spellingChecker(val));
                System.out.print(val + " ");//當前檢查文字
                System.out.println(sendWord);//返回是否拼寫正確
                if ((e.accept(new spellingChecker(val)) == false) && (val.length() < 1)) { //判斷是否為空
                    System.out.println("空");
                }
            }
            //最後寫一條，如果val是空，返回true

        }
    }
}
