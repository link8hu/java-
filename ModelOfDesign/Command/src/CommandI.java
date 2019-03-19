/**
 * @program: ModelOfDesign
 * @description: Command接口，执行和撤销
 * @author: Mr.Hu
 * @create: 2019-03-19 11:48
 */
interface CommandI {
    public void execute();
    public void undo();
}
