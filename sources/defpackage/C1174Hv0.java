package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1174Hv0 {

    @NotNull
    public final LQ1 a;

    @NotNull
    public final C3595ea b;

    @NotNull
    public final DS0 c;

    @NotNull
    public final MI d;

    @NotNull
    public final C4903ka e;

    @NotNull
    public final AtomicBoolean f;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @NotNull
    public final AtomicBoolean i;

    @Nullable
    public final InterfaceC0784Cv0 j;

    public C1174Hv0(@NotNull LQ1 storage, @NotNull C3595ea amplitude, @NotNull DS0 logger, @NotNull MI configuration, @NotNull C4903ka plugin) {
        InterfaceC0784Cv0 c0706Bv0;
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.a = storage;
        this.b = amplitude;
        this.c = logger;
        this.d = configuration;
        this.e = plugin;
        this.f = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        if (storage instanceof InterfaceC4354i90) {
            c0706Bv0 = new C0628Av0((InterfaceC4354i90) storage, logger, amplitude);
        } else if (storage instanceof C6458rx0) {
            c0706Bv0 = new C0706Bv0((C6458rx0) storage);
        } else {
            logger.warn("Custom storage, identify intercept not started");
            c0706Bv0 = null;
        }
        this.j = c0706Bv0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:99:0x0158 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        if (c(r0) == r1) goto L99;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.C0612Aq r12, @org.jetbrains.annotations.NotNull defpackage.LM r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1174Hv0.a(Aq, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(C0612Aq c0612Aq, LM lm) {
        C0940Ev0 c0940Ev0;
        C1174Hv0 c1174Hv0;
        if (lm instanceof C0940Ev0) {
            c0940Ev0 = (C0940Ev0) lm;
            int i = c0940Ev0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0940Ev0.h = i - Integer.MIN_VALUE;
            } else {
                c0940Ev0 = new C0940Ev0(this, lm);
            }
        } else {
            c0940Ev0 = new C0940Ev0(this, lm);
        }
        Object obj = c0940Ev0.e;
        MN mn = MN.d;
        int i2 = c0940Ev0.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            try {
                LQ1 lq1 = this.a;
                c0940Ev0.d = this;
                c0940Ev0.h = 1;
                if (lq1.e(c0612Aq, c0940Ev0) == mn) {
                    return mn;
                }
            } catch (Exception e) {
                e = e;
                c1174Hv0 = this;
                C8056za.p(e, c1174Hv0.c, "Error when intercepting identifies");
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1174Hv0 = c0940Ev0.d;
            try {
                C1795Pt1.b(obj);
            } catch (Exception e2) {
                e = e2;
                C8056za.p(e, c1174Hv0.c, "Error when intercepting identifies");
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull LM lm) {
        C1096Gv0 c1096Gv0;
        C1174Hv0 c1174Hv0;
        if (lm instanceof C1096Gv0) {
            c1096Gv0 = (C1096Gv0) lm;
            int i = c1096Gv0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1096Gv0.h = i - Integer.MIN_VALUE;
            } else {
                c1096Gv0 = new C1096Gv0(this, lm);
            }
        } else {
            c1096Gv0 = new C1096Gv0(this, lm);
        }
        Object objA = c1096Gv0.e;
        MN mn = MN.d;
        int i2 = c1096Gv0.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c1096Gv0.d = this;
            c1096Gv0.h = 1;
            InterfaceC0784Cv0 interfaceC0784Cv0 = this.j;
            Intrinsics.checkNotNull(interfaceC0784Cv0);
            objA = interfaceC0784Cv0.a(c1096Gv0);
            if (objA == mn) {
                return mn;
            }
            c1174Hv0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1174Hv0 = c1096Gv0.d;
            C1795Pt1.b(objA);
        }
        C0612Aq event = (C0612Aq) objA;
        if (event != null) {
            C4903ka c4903ka = c1174Hv0.e;
            c4903ka.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            K80 k80 = c4903ka.h;
            if (k80 == null) {
                Intrinsics.l("pipeline");
                throw null;
            }
            k80.a(event);
        }
        return Unit.a;
    }
}
