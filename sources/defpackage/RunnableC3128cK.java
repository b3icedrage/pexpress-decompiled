package defpackage;

import android.text.TextUtils;
import io.sentry.android.replay.r;
import io.sentry.android.replay.s;
import io.sentry.android.replay.w;
import io.sentry.util.f;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3128cK implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3128cK(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [fO0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C0996Fo c0996FoC;
        C0996Fo c0996FoE;
        Field field;
        boolean z = true;
        switch (this.d) {
            case 0:
                C3338dK this$0 = (C3338dK) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C6104qF0.a("PONG TIMEOUT");
                this$0.a.c(4001, null);
                return;
            case 1:
                C2296Wd0 c2296Wd0 = (C2296Wd0) this.e;
                c2296Wd0.getClass();
                Object obj = C2296Wd0.m;
                synchronized (obj) {
                    try {
                        C1198Id0 c1198Id0 = c2296Wd0.a;
                        c1198Id0.a();
                        NO noA = NO.a(c1198Id0.a);
                        try {
                            c0996FoC = c2296Wd0.c.c();
                            if (noA != null) {
                                noA.c();
                            }
                        } catch (Throwable th) {
                            if (noA != null) {
                                noA.c();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    if (c0996FoC.f() == C7019ud1.a.i) {
                        c0996FoE = c2296Wd0.e(c0996FoC);
                    } else {
                        if (c0996FoC.f() != C7019ud1.a.g) {
                            z = false;
                        }
                        if (z) {
                            c0996FoE = c2296Wd0.e(c0996FoC);
                        } else if (!c2296Wd0.d.a(c0996FoC)) {
                            return;
                        } else {
                            c0996FoE = c2296Wd0.b(c0996FoC);
                        }
                    }
                    synchronized (obj) {
                        try {
                            C1198Id0 c1198Id1 = c2296Wd0.a;
                            c1198Id1.a();
                            NO noA2 = NO.a(c1198Id1.a);
                            try {
                                c2296Wd0.c.b(c0996FoE);
                                if (noA2 != null) {
                                    noA2.c();
                                }
                            } catch (Throwable th3) {
                                if (noA2 != null) {
                                    noA2.c();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (c2296Wd0) {
                        if (c2296Wd0.k.size() != 0 && !TextUtils.equals(c0996FoC.b, c0996FoE.b)) {
                            Iterator it = c2296Wd0.k.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC5755oc0) it.next()).a();
                            }
                        }
                    }
                    if (c0996FoE.f() == C7019ud1.a.h) {
                        String str = c0996FoE.b;
                        synchronized (c2296Wd0) {
                            c2296Wd0.j = str;
                        }
                    }
                    if (c0996FoE.f() == C7019ud1.a.i) {
                        c2296Wd0.f(new C2478Yd0());
                        return;
                    }
                    C7019ud1.a aVar = C7019ud1.a.e;
                    C7019ud1.a aVar2 = c0996FoE.c;
                    if (aVar2 == aVar || aVar2 == C7019ud1.a.d) {
                        c2296Wd0.f(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c2296Wd0.g(c0996FoE);
                        return;
                    }
                } catch (C2478Yd0 e) {
                    c2296Wd0.f(e);
                    return;
                }
            case 2:
                File[] fileArrListFiles = ((File) this.e).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file : fileArrListFiles) {
                    if (file.lastModified() < QF1.f - TimeUnit.MINUTES.toMillis(5L)) {
                        f.a(file);
                    }
                }
                return;
            default:
                s sVar = (s) this.e;
                if (sVar.d.get()) {
                    return;
                }
                Object obj2 = w.a;
                r swap = new r(sVar);
                Intrinsics.checkNotNullParameter(swap, "swap");
                try {
                    Object value = w.b.getValue();
                    if (value == null || (field = (Field) w.c.getValue()) == null) {
                        return;
                    }
                    Object obj3 = field.get(value);
                    Intrinsics.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
                    field.set(value, swap.invoke((ArrayList) obj3));
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
