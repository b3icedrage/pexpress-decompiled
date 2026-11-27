package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1170Hu {
    public static boolean canResolveBroadcast(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static List<ResolveInfo> resolveBroadcast(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null ? listQueryBroadcastReceivers : Collections.EMPTY_LIST;
    }

    public static void sendIntentExplicitly(Context context, Intent intent) throws RK1 {
        List<ResolveInfo> listResolveBroadcast = resolveBroadcast(context, intent);
        if (listResolveBroadcast.size() == 0) {
            throw new RK1("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : listResolveBroadcast) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
