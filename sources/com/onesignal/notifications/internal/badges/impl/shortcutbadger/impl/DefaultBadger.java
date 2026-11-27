package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.C1170Hu;
import defpackage.InterfaceC2093Tp;
import defpackage.RK1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultBadger implements InterfaceC2093Tp {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    @Override // defpackage.InterfaceC2093Tp
    public void executeBadge(Context context, ComponentName componentName, int i) throws RK1 {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        if (C1170Hu.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new RK1("unable to resolve intent: " + intent.toString());
        }
    }

    @Override // defpackage.InterfaceC2093Tp
    public List<String> getSupportLaunchers() {
        return new ArrayList(0);
    }

    public boolean isSupported(Context context) {
        return C1170Hu.canResolveBroadcast(context, new Intent(INTENT_ACTION));
    }
}
