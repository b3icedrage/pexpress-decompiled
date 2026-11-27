package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UN0 {

    @NotNull
    public final Function0<Long> a;

    @NotNull
    public final ArrayList b;
    public long c;

    @Nullable
    public volatile InterfaceC3220cl d;

    public static final class a {

        @NotNull
        public final String a;
        public final long b;

        @Nullable
        public volatile Long c;

        public a(String name, long j) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.a = name;
            this.b = j;
            this.c = null;
        }
    }

    public UN0(Object obj) {
        TN0 clock = TN0.m;
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = clock;
        this.b = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ol] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ol] */
    @Nullable
    public final Object a(@NotNull String str, @NotNull Function1 function1, @NotNull LM lm) throws Throwable {
        WN0 wn0;
        a aVar;
        UN0 un0;
        if (lm instanceof WN0) {
            wn0 = (WN0) lm;
            int i = wn0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                wn0.j = i - Integer.MIN_VALUE;
            } else {
                wn0 = new WN0(this, lm);
            }
        } else {
            wn0 = new WN0(this, lm);
        }
        Object obj = wn0.h;
        MN mn = MN.d;
        int i2 = wn0.j;
        boolean z = false;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                a aVar2 = new a(str, this.a.invoke().longValue());
                synchronized (this.b) {
                    this.b.add(aVar2);
                }
                InterfaceC3220cl interfaceC3220cl = this.d;
                InterfaceC5790ol interfaceC5790olD = interfaceC3220cl != null ? interfaceC3220cl.d(str) : null;
                wn0.d = this;
                wn0.e = aVar2;
                wn0.g = interfaceC5790olD;
                wn0.j = 1;
                Object objInvoke = function1.invoke(wn0);
                if (objInvoke == mn) {
                    return mn;
                }
                obj = objInvoke;
                aVar = aVar2;
                un0 = this;
                str = interfaceC5790olD;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC5790ol interfaceC5790ol = wn0.g;
                aVar = wn0.e;
                un0 = wn0.d;
                C1795Pt1.b(obj);
                str = interfaceC5790ol;
            }
            XF0 xf0 = (XF0) wn0.getContext().p(XF0.a.d);
            boolean zG = xf0 != null ? xf0.g() : true;
            if (zG) {
                try {
                    aVar.c = un0.a.invoke();
                } catch (Throwable th) {
                    th = th;
                    z = zG;
                    if (str != 0) {
                        str.a(z);
                    }
                    throw th;
                }
            }
            if (str != 0) {
                str.a(zG);
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
