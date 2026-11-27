package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.C3027bp1;
import defpackage.C7766y91;
import defpackage.D61;
import defpackage.InterfaceC1950Rt0;
import defpackage.LY1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onesignal/NotificationOpenedActivityHMS;", "Landroid/app/Activity;", "<init>", "()V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationOpenedActivityHMS extends Activity {
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    public final void a() throws Throwable {
        Intent intent = getIntent();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        if (C7766y91.c(applicationContext)) {
            C3027bp1 c3027bp1 = new C3027bp1();
            c3027bp1.d = C7766y91.b().getService(InterfaceC1950Rt0.class);
            LY1.suspendifyBlocking(new D61(c3027bp1, this, intent, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        a();
    }
}
