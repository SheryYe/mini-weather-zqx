package cn.edu.pku.zhangqixun.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by yebaobao on 2016/9/27.
 */
public class NetUtil {
    public static final int NETWORN_NONE=0;
    public static final int NEIWOREN_WIFI=1;
    public static final int NETWORDEN_MOBLIE=2;
    public static int getNetworkState(Context  context){
        ConnectivityManager connManger = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connManger.getActiveNetworkInfo();
        if (networkInfo == null){
            return NETWORN_NONE;
        }
        int nType = networkInfo.getType();
        if (nType == ConnectivityManager.TYPE_MOBILE) {
            return NETWORDEN_MOBLIE;

        }
        else if (nType == ConnectivityManager.TYPE_WIFI){
            return NEIWOREN_WIFI;
        }
       return NETWORN_NONE;
    }
}
