package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6062q31 implements I31 {

    @NotNull
    public final InterfaceC0859Du0 a;

    @NotNull
    public final Y71 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    @NotNull
    public final C5698oK d;

    @NotNull
    public final C4923kf e;

    @NotNull
    public final VK1 f;

    @NotNull
    public final Context g;

    @NotNull
    public final InterfaceC4358iA0 h;

    @Nullable
    public C4076gq i;

    @NotNull
    public final GP1 j;
    public volatile boolean k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final GP1 m;

    /* JADX INFO: renamed from: q31$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3495e41.values().length];
            try {
                EnumC3495e41 enumC3495e41 = EnumC3495e41.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC3495e41 enumC3495e42 = EnumC3495e41.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC3495e41 enumC3495e43 = EnumC3495e41.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC3495e41 enumC3495e44 = EnumC3495e41.d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC3495e41 enumC3495e45 = EnumC3495e41.d;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EnumC3495e41 enumC3495e46 = EnumC3495e41.d;
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EnumC3495e41 enumC3495e47 = EnumC3495e41.d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public C6062q31(@NotNull InterfaceC0859Du0 robotNotificationManager, @NotNull Y71 appNavigator, @NotNull InterfaceC3951gE1 screenProvider, @NotNull C5698oK connectionStatusProvider, @NotNull C4923kf appDataRepository, @NotNull VK1 showAlertDialogUseCase, @NotNull Context context, @NotNull InterfaceC4358iA0 initializeExecutorUseCase) {
        Intrinsics.checkNotNullParameter(robotNotificationManager, "robotNotificationManager");
        Intrinsics.checkNotNullParameter(appNavigator, "appNavigator");
        Intrinsics.checkNotNullParameter(screenProvider, "screenProvider");
        Intrinsics.checkNotNullParameter(connectionStatusProvider, "connectionStatusProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        this.a = robotNotificationManager;
        this.b = appNavigator;
        this.c = screenProvider;
        this.d = connectionStatusProvider;
        this.e = appDataRepository;
        this.f = showAlertDialogUseCase;
        this.g = context;
        this.h = initializeExecutorUseCase;
        Boolean bool = Boolean.FALSE;
        this.j = C1589Ne.i(bool);
        this.l = C1589Ne.i(bool);
        this.m = C1589Ne.i(bool);
    }

    public static final Object b(C6062q31 c6062q31, AW1 aw1) {
        GP1 gp1 = c6062q31.e.r;
        EnumC3495e41 enumC3495e41 = EnumC3495e41.l;
        gp1.getClass();
        gp1.m(null, enumC3495e41);
        Object objC = c6062q31.h.c(aw1);
        return objC == MN.d ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(C6062q31 c6062q31, JM jm) {
        G31 g31;
        C2643a41 c2643a41;
        C2643a41.a aVar;
        c6062q31.getClass();
        if (jm instanceof G31) {
            g31 = (G31) jm;
            int i = g31.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                g31.i = i - Integer.MIN_VALUE;
            } else {
                g31 = new G31(c6062q31, jm);
            }
        } else {
            g31 = new G31(c6062q31, jm);
        }
        Object obj = g31.g;
        Object obj2 = MN.d;
        int i2 = g31.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2643a41 c2643a42 = c6062q31.e.u;
            C2643a41.a aVar2 = c2643a42.a.get();
            g31.d = c2643a42;
            g31.e = aVar2;
            g31.i = 1;
            Object objD = c6062q31.d(aVar2, g31);
            if (objD == obj2) {
                return obj2;
            }
            c2643a41 = c2643a42;
            obj = objD;
            aVar = aVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = g31.e;
            c2643a41 = g31.d;
            C1795Pt1.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            if (aVar == null) {
                c2643a41.getClass();
            } else {
                AtomicReference<C2643a41.a> atomicReference = c2643a41.a;
                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.I31
    public final void a(@NotNull InterfaceC8042zV0 activity) {
        int i = 0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4923kf c4923kf = this.e;
        GP1 gp1 = c4923kf.r;
        GP1 gp2 = c4923kf.h;
        C5189lv.k(activity.d(), C6266r20.a, new C6901u31(C4466ii.x(gp1, new B31(gp2)), C4466ii.f(gp2), this, activity, null), 2);
        activity.d().e(new A31(this, null));
        InterfaceC6396rf0<AbstractC4387iK> interfaceC6396rf0 = this.d.b;
        C4250hg0 c4250hg0 = new C4250hg0(new C2616Zx0(this.b.a(), this, 1), 0);
        C3098cA c3098cAX = C4466ii.x(new C7532x31(interfaceC6396rf0, i), new C7742y31(this.m));
        C4466ii.v(activity.d(), new C6400rg0(i, new InterfaceC6396rf0[]{c4250hg0, c3098cAX, this.l, this.j, c4923kf.z}, new C7952z31(this, activity, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(C2643a41.a aVar, LM lm) {
        C6271r31 c6271r31;
        C6062q31 c6062q31;
        if (lm instanceof C6271r31) {
            c6271r31 = (C6271r31) lm;
            int i = c6271r31.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6271r31.h = i - Integer.MIN_VALUE;
            } else {
                c6271r31 = new C6271r31(this, lm);
            }
        } else {
            c6271r31 = new C6271r31(this, lm);
        }
        Object objA = c6271r31.e;
        Object obj = MN.d;
        int i2 = c6271r31.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            if (this.e.k.getValue() == null) {
                return Boolean.FALSE;
            }
            VK1 vk1 = this.f;
            C6481s31 action = new C6481s31(0, this, C6062q31.class, "onTryAgainClicked", "onTryAgainClicked()V", 0);
            C5852p31 dismissAction = new C5852p31(this, aVar);
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
            AbstractC1592Nf.o oVar = new AbstractC1592Nf.o(N9.a(new C5137lg(action, dismissAction, 0)));
            c6271r31.d = this;
            c6271r31.h = 1;
            objA = vk1.a(oVar, null, null);
            if (objA == obj) {
                return obj;
            }
            c6062q31 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6062q31 = c6271r31.d;
            C1795Pt1.b(objA);
        }
        Boolean bool = (Boolean) objA;
        bool.getClass();
        c6062q31.k = false;
        return bool;
    }

    public final Object e(InterfaceC8042zV0 interfaceC8042zV0, AW1 aw1) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new C6691t31(this, interfaceC8042zV0, null), aw1);
        return objP == MN.d ? objP : Unit.a;
    }
}
