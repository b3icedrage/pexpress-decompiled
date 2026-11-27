package defpackage;

import android.content.Context;
import io.sentry.android.sqlite.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5959pa2 implements JW1.a, InterfaceC3376dW1.c {
    public final /* synthetic */ Object d;

    public /* synthetic */ C5959pa2(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC3376dW1.c
    public InterfaceC3376dW1 a(InterfaceC3376dW1.b configuration) {
        Context context = (Context) this.d;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC3376dW1.a callback = configuration.c;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        String str = configuration.b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        Intrinsics.checkNotNullParameter(new InterfaceC3376dW1.b(context, str, callback, true, true), "configuration");
        return d.c(new C3423dj0(context, str, callback, true, true));
    }

    @Override // JW1.a
    public Object c() {
        return ((LD) this.d).f();
    }
}
