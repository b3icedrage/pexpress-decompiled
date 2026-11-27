package defpackage;

import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.cache.a;
import io.sentry.util.l;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6861tr1 implements InterfaceC5056lH, MD1, l.a {
    public final /* synthetic */ Object d;

    public /* synthetic */ C6861tr1(Object obj) {
        this.d = obj;
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        List<a.C0380a<?>> list = a.p;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.d;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zExists = file.exists();
                if (zExists && !file.delete()) {
                    sentryAndroidOptions.getLogger().a(NG1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z = zExists;
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return RemoteConfigRegistrar.lambda$getComponents$0((C7892yl1) this.d, c1480Lt1);
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.h(NG1.WARNING);
        C5315mW0 builder = new C5315mW0();
        C4025gc1 c4025gc1 = (C4025gc1) this.d;
        String str = c4025gc1.a;
        builder.put("type", str);
        builder.put("raw_size", Integer.valueOf(c4025gc1.b));
        Unit unit = Unit.a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        scope.E(builder.c(), "parse");
        scope.m(WE.f("parse-error", str, "unknown"));
    }
}
