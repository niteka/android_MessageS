package mbd.fr.messageS;

public interface MainFragmentCallBack {
    /**
     * Un item a été sélectionné dans le fragment
     * En tant que CallBack du fragment, vous devriez faire quelque chose avec cette information
     * @param itemId
     */
    public void onItemSelected(int itemId);
}