package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;
import defpackage.C1717Ot1;
import defpackage.FP0;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4994l implements InterfaceC4604j70 {
    public static final Object a = new Object();

    @NotNull
    public static final GW1 b = new GW1("CLOSED");

    @NotNull
    public static final C4994l c = new C4994l();
    public static final Object d = new Object();
    public static char[] e = new char[24];

    public static final void b(@NotNull InterfaceC1958Rw interfaceC1958Rw) {
        Intrinsics.checkNotNullParameter(interfaceC1958Rw, "<this>");
        interfaceC1958Rw.a(null);
    }

    @NotNull
    public static final EnumC3718f72 c(@NotNull EnumC3610ed2 enumC3610ed2) {
        Intrinsics.checkNotNullParameter(enumC3610ed2, "<this>");
        int iOrdinal = enumC3610ed2.ordinal();
        if (iOrdinal == 0) {
            return EnumC3718f72.INV;
        }
        if (iOrdinal == 1) {
            return EnumC3718f72.IN;
        }
        if (iOrdinal == 2) {
            return EnumC3718f72.OUT;
        }
        throw new C6489s51();
    }

    @NotNull
    public static final Object d(@NotNull AbstractC7992zE1 abstractC7992zE1, long j, @NotNull Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (abstractC7992zE1.g >= j && !abstractC7992zE1.d()) {
                return abstractC7992zE1;
            }
            Object obj = XH.d.get(abstractC7992zE1);
            GW1 gw1 = b;
            if (obj == gw1) {
                return gw1;
            }
            AbstractC7992zE1 abstractC7992zE2 = (AbstractC7992zE1) ((XH) obj);
            if (abstractC7992zE2 == null) {
                abstractC7992zE2 = (AbstractC7992zE1) function2.invoke(Long.valueOf(abstractC7992zE1.g + 1), abstractC7992zE1);
                do {
                    atomicReferenceFieldUpdater = XH.d;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC7992zE1, null, abstractC7992zE2)) {
                        if (abstractC7992zE1.d()) {
                            abstractC7992zE1.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC7992zE1) == null);
            }
            abstractC7992zE1 = abstractC7992zE2;
        }
    }

    public static void e(long j, PrintWriter printWriter) {
        synchronized (d) {
            printWriter.print(new String(e, 0, f(j)));
        }
    }

    public static int f(long j) {
        char c2;
        int i;
        int i2;
        int i3;
        if (e.length < 0) {
            e = new char[0];
        }
        char[] cArr = e;
        if (j == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c2 = '+';
        } else {
            j = -j;
            c2 = '-';
        }
        int i4 = (int) (j % 1000);
        int iFloor = (int) Math.floor(j / 1000);
        if (iFloor > 86400) {
            i = iFloor / 86400;
            iFloor -= 86400 * i;
        } else {
            i = 0;
        }
        if (iFloor > 3600) {
            i2 = iFloor / 3600;
            iFloor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (iFloor > 60) {
            int i5 = iFloor / 60;
            iFloor -= i5 * 60;
            i3 = i5;
        } else {
            i3 = 0;
        }
        cArr[0] = c2;
        int i6 = i(cArr, i, 'd', 1, false, 0);
        int i7 = i(cArr, i2, 'h', i6, i6 != 1, 0);
        int i8 = i(cArr, i3, 'm', i7, i7 != 1, 0);
        int i9 = i(cArr, i4, 'm', i(cArr, iFloor, 's', i8, i8 != 1, 0), true, 0);
        cArr[i9] = 's';
        return i9 + 1;
    }

    public static String g(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [EP0, T, coil.util.-Lifecycles$observeStarted$2$1, java.lang.Object] */
    @Nullable
    public static final Object h(@NotNull g gVar, @NotNull LM lm) throws Throwable {
        C4784k frame;
        g gVar2;
        C3027bp1 c3027bp1;
        Throwable th;
        g gVar3;
        EP0 ep0;
        EP0 ep1;
        if (lm instanceof C4784k) {
            frame = (C4784k) lm;
            int i = frame.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.e = i - Integer.MIN_VALUE;
            } else {
                frame = new C4784k(lm);
            }
        } else {
            frame = new C4784k(lm);
        }
        Object obj = frame.d;
        MN mn = MN.d;
        int i2 = frame.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = frame.h;
            gVar2 = frame.g;
            try {
                C1795Pt1.b(obj);
                gVar3 = gVar2;
                ep1 = (EP0) c3027bp1.d;
                if (ep1 != null) {
                    gVar3.c(ep1);
                }
                return Unit.a;
            } catch (Throwable th2) {
                th = th2;
                ep0 = (EP0) c3027bp1.d;
                if (ep0 != null) {
                    gVar2.c(ep0);
                }
                throw th;
            }
        }
        C3027bp1 c3027bp1B = C4564j.b(obj);
        c3027bp1B.d = null;
        try {
            frame.g = gVar;
            frame.h = c3027bp1B;
            frame.e = 1;
            final C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            ?? r3 = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$observeStarted$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStart(@NotNull FP0 owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Unit unit = Unit.a;
                    C1717Ot1.a aVar = C1717Ot1.e;
                    c6251qy.resumeWith(unit);
                }
            };
            c3027bp1B.d = r3;
            Intrinsics.checkNotNull(r3);
            gVar.a(r3);
            Object objQ = c6251qy.q();
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return mn;
            }
            gVar3 = gVar;
            c3027bp1 = c3027bp1B;
            ep1 = (EP0) c3027bp1.d;
            if (ep1 != null) {
                gVar3.c(ep1);
            }
            return Unit.a;
        } catch (Throwable th3) {
            gVar2 = gVar;
            c3027bp1 = c3027bp1B;
            th = th3;
            ep0 = (EP0) c3027bp1.d;
            if (ep0 != null) {
                gVar2.c(ep0);
            }
            throw th;
        }
    }

    public static int i(char[] cArr, int i, char c2, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c2;
        return i4 + 2;
    }

    public static void j(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    @Nullable
    public static final Object k(@NotNull InterfaceC1958Rw interfaceC1958Rw, @NotNull byte[] bArr, @NotNull LM lm) {
        Object objG = interfaceC1958Rw.g(bArr, bArr.length, lm);
        return objG == MN.d ? objG : Unit.a;
    }

    @Override // defpackage.InterfaceC4604j70
    @NotNull
    public Boolean a() {
        return Boolean.TRUE;
    }
}
