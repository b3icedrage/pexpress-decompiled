package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.C1170Hu;
import defpackage.InterfaceC2093Tp;
import defpackage.RK1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NewHtcHomeBadger implements InterfaceC2093Tp {
    public static final String COUNT = "count";
    public static final String EXTRA_COMPONENT = "com.htc.launcher.extra.COMPONENT";
    public static final String EXTRA_COUNT = "com.htc.launcher.extra.COUNT";
    public static final String INTENT_SET_NOTIFICATION = "com.htc.launcher.action.SET_NOTIFICATION";
    public static final String INTENT_UPDATE_SHORTCUT = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String PACKAGENAME = "packagename";

    @Override // defpackage.InterfaceC2093Tp
    public void executeBadge(Context context, ComponentName componentName, int i) throws RK1 {
        Intent intent = new Intent(INTENT_SET_NOTIFICATION);
        intent.putExtra(EXTRA_COMPONENT, componentName.flattenToShortString());
        intent.putExtra(EXTRA_COUNT, i);
        Intent intent2 = new Intent(INTENT_UPDATE_SHORTCUT);
        intent2.putExtra(PACKAGENAME, componentName.getPackageName());
        intent2.putExtra(COUNT, i);
        if (C1170Hu.canResolveBroadcast(context, intent) || C1170Hu.canResolveBroadcast(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        } else {
            throw new RK1("unable to resolve intent: " + intent2.toString());
        }
    }

    @Override // defpackage.InterfaceC2093Tp
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.htc.launcher");
    }
}
