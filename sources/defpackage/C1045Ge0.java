package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ge0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045Ge0 implements InterfaceC0967Fe0 {
    public static final long d;
    public static final /* synthetic */ int e = 0;

    @NotNull
    public final InterfaceC3951gE1 a;

    @NotNull
    public final C5253mB1 b;

    @NotNull
    public final InterfaceC7385wM0 c;

    /* JADX INFO: renamed from: Ge0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC7385wM0.a.values().length];
            try {
                InterfaceC7385wM0.a aVar = InterfaceC7385wM0.a.d;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InterfaceC7385wM0.a aVar2 = InterfaceC7385wM0.a.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InterfaceC7385wM0.a aVar3 = InterfaceC7385wM0.a.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InterfaceC7385wM0.a aVar4 = InterfaceC7385wM0.a.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    static {
        b.a aVar = b.e;
        d = c.g(1, R40.SECONDS);
    }

    public C1045Ge0(@NotNull InterfaceC3951gE1 screensProvider, @NotNull C5253mB1 router, @NotNull InterfaceC7385wM0 lastOpenScreenProvider) {
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(lastOpenScreenProvider, "lastOpenScreenProvider");
        this.a = screensProvider;
        this.b = router;
        this.c = lastOpenScreenProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object d(C1045Ge0 c1045Ge0, NV0 nv0, C5560ng c5560ng, LM lm) {
        C1201Ie0 c1201Ie0;
        Function0 function0;
        Function0 function1;
        if (lm instanceof C1201Ie0) {
            c1201Ie0 = (C1201Ie0) lm;
            int i = c1201Ie0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1201Ie0.h = i - Integer.MIN_VALUE;
            } else {
                c1201Ie0 = new C1201Ie0(c1045Ge0, lm);
            }
        } else {
            c1201Ie0 = new C1201Ie0(c1045Ge0, lm);
        }
        Object obj = c1201Ie0.e;
        Object obj2 = MN.d;
        int i2 = c1201Ie0.h;
        if (i2 != 0) {
            if (i2 == 1) {
                Function0 function2 = c1201Ie0.d;
                C1795Pt1.b(obj);
                function0 = function2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function0 function3 = c1201Ie0.d;
                C1795Pt1.b(obj);
                function1 = function3;
            }
            function1.invoke();
            return Unit.a;
        }
        C1795Pt1.b(obj);
        InterfaceC7385wM0 interfaceC7385wM0 = c1045Ge0.c;
        if (interfaceC7385wM0.b() == null || interfaceC7385wM0.b() == InterfaceC7385wM0.a.d) {
            c1201Ie0.d = c5560ng;
            c1201Ie0.h = 1;
            function0 = c5560ng;
            if (c1045Ge0.c(nv0, c1201Ie0) != obj2) {
            }
            return obj2;
        }
        InterfaceC7385wM0 interfaceC7385wM1 = c1045Ge0.c;
        InterfaceC7385wM0.a screen = interfaceC7385wM1.b();
        Intrinsics.checkNotNull(screen);
        Intrinsics.checkNotNullParameter(screen, "screen");
        int i3 = a.a[screen.ordinal()];
        C5253mB1 c5253mB1 = c1045Ge0.b;
        if (i3 == 1) {
            InterfaceC3951gE1 interfaceC3951gE1 = c1045Ge0.a;
            c5253mB1.d(new AbstractC2307Wh[]{interfaceC3951gE1.n(), interfaceC3951gE1.B()});
        } else {
            c5253mB1.e(c1045Ge0.b(screen));
        }
        interfaceC7385wM1.a(null);
        function0 = c5560ng;
        RV rv = C6266r20.a;
        C1279Je0 c1279Je0 = new C1279Je0(2, null);
        c1201Ie0.d = function0;
        c1201Ie0.h = 2;
        if (C5189lv.p(rv, c1279Je0, c1201Ie0) != obj2) {
            function1 = function0;
            function1.invoke();
            return Unit.a;
        }
        return obj2;
    }

    @Override // defpackage.InterfaceC0967Fe0
    @Nullable
    public final Object a(@NotNull NV0 nv0, @NotNull C5560ng c5560ng, @NotNull ActivityC6781tV0.b bVar) {
        return d(this, nv0, c5560ng, bVar);
    }

    public final C0667Bi0 b(InterfaceC7385wM0.a aVar) {
        int iOrdinal = aVar.ordinal();
        InterfaceC3951gE1 interfaceC3951gE1 = this.a;
        if (iOrdinal == 0) {
            return interfaceC3951gE1.r();
        }
        if (iOrdinal == 1) {
            return interfaceC3951gE1.f();
        }
        if (iOrdinal == 2) {
            return interfaceC3951gE1.k();
        }
        if (iOrdinal == 3) {
            return interfaceC3951gE1.B();
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object c(NV0 nv0, LM lm) {
        C1123He0 c1123He0;
        C1045Ge0 c1045Ge0;
        if (lm instanceof C1123He0) {
            c1123He0 = (C1123He0) lm;
            int i = c1123He0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1123He0.h = i - Integer.MIN_VALUE;
            } else {
                c1123He0 = new C1123He0(this, lm);
            }
        } else {
            c1123He0 = new C1123He0(this, lm);
        }
        Object objA = c1123He0.e;
        MN mn = MN.d;
        int i2 = c1123He0.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            Intrinsics.c(nv0, "null cannot be cast to non-null type com.api.feature.app.viewmodel.MainActivityViewModelApi");
            GP1 gp1P = nv0.p();
            c1123He0.d = this;
            c1123He0.h = 1;
            objA = C7236vf0.a(gp1P, c1123He0);
            if (objA == mn) {
                return mn;
            }
            c1045Ge0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1045Ge0 = c1123He0.d;
            C1795Pt1.b(objA);
        }
        C5253mB1 c5253mB1 = c1045Ge0.b;
        C0667Bi0 screen = c1045Ge0.b((InterfaceC7385wM0.a) objA);
        c5253mB1.getClass();
        Intrinsics.d(screen, "screen");
        c5253mB1.a(new C1789Pr1(screen));
        return Unit.a;
    }
}
