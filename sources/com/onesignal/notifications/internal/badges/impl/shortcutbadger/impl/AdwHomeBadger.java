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
public class AdwHomeBadger implements InterfaceC2093Tp {
    public static final String CLASSNAME = "CNAME";
    public static final String COUNT = "COUNT";
    public static final String INTENT_UPDATE_COUNTER = "org.adw.launcher.counter.SEND";
    public static final String PACKAGENAME = "PNAME";

    @Override // defpackage.InterfaceC2093Tp
    public void executeBadge(Context context, ComponentName componentName, int i) throws RK1 {
        Intent intent = new Intent(INTENT_UPDATE_COUNTER);
        intent.putExtra(PACKAGENAME, componentName.getPackageName());
        intent.putExtra(CLASSNAME, componentName.getClassName());
        intent.putExtra(COUNT, i);
        if (C1170Hu.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new RK1("unable to resolve intent: " + intent.toString());
        }
    }

    @Override // defpackage.InterfaceC2093Tp
    public List<String> getSupportLaunchers() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
