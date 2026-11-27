package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3889fx1 extends C7576xG {

    @NotNull
    public final C3051bx1 d;

    @NotNull
    public final InterfaceC2194Uw1 e;

    @NotNull
    public final ReporterApi f;

    @NotNull
    public final a g;

    @Nullable
    public C2936bP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final C1699On1 j;

    @NotNull
    public final C1699On1 k;

    /* JADX INFO: renamed from: fx1$a */
    public static final class a implements InterfaceC6396rf0<C1491Lx0> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: fx1$a$a, reason: collision with other inner class name */
        public static final class C0356a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: fx1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.indicators.RobotIndicatorViewModelBase$special$$inlined$map$1$2", f = "RobotIndicatorViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0357a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0357a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0356a.this.a(null, this);
                }
            }

            public C0356a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0357a c0357a;
                if (jm instanceof C0357a) {
                    c0357a = (C0357a) jm;
                    int i = c0357a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0357a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0357a = new C0357a(jm);
                    }
                } else {
                    c0357a = new C0357a(jm);
                }
                Object obj2 = c0357a.d;
                MN mn = MN.d;
                int i2 = c0357a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C1491Lx0 c1491Lx0A = C1491Lx0.a((C1491Lx0) obj, false, false, 32767);
                    c0357a.e = 1;
                    if (this.d.a(c1491Lx0A, c0357a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C1491Lx0> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0356a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C3889fx1(@NotNull NQ currentIndicatorProvider, @NotNull C3051bx1 robotIndicatorProvider, @NotNull InterfaceC2194Uw1 callbacks, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(robotIndicatorProvider, "robotIndicatorProvider");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.d = robotIndicatorProvider;
        this.e = callbacks;
        this.f = reporter;
        this.g = new a(currentIndicatorProvider.b);
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.i = gp1I;
        this.j = C4466ii.f(gp1I);
        this.k = robotIndicatorProvider.g;
    }
}
