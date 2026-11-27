package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.C1778Po;
import defpackage.C3081c52;
import defpackage.C7456wh1;
import defpackage.C7639xa2;
import defpackage.EnumC6825th1;
import defpackage.RunnableC5749oa2;
import defpackage.RunnableC6293r9;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C3081c52.b(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        EnumC6825th1 enumC6825th1B = C7456wh1.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        C7639xa2 c7639xa2 = C3081c52.a().d;
        C1778Po c1778Po = new C1778Po(queryParameter, bArrDecode, enumC6825th1B);
        RunnableC6293r9 runnableC6293r9 = new RunnableC6293r9();
        c7639xa2.getClass();
        c7639xa2.e.execute(new RunnableC5749oa2(c7639xa2, c1778Po, i, runnableC6293r9));
    }
}
