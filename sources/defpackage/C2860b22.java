package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2860b22 implements InterfaceC2636a22 {

    @NotNull
    public final C1699On1 a;

    @NotNull
    public final C1699On1 b;

    /* JADX INFO: renamed from: b22$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ C1621Nn1 d;

        /* JADX INFO: renamed from: b22$a$a, reason: collision with other inner class name */
        public static final class C0245a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: b22$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.graphic.providers.TraderInfoProviderBase$special$$inlined$map$1$2", f = "TraderInfoProviderBase.kt", l = {219}, m = "emit")
            public static final class C0246a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0246a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0245a.this.a(null, this);
                }
            }

            public C0245a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0246a c0246a;
                if (jm instanceof C0246a) {
                    c0246a = (C0246a) jm;
                    int i = c0246a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0246a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0246a = new C0246a(jm);
                    }
                } else {
                    c0246a = new C0246a(jm);
                }
                Object obj2 = c0246a.d;
                MN mn = MN.d;
                int i2 = c0246a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(Intrinsics.a((Z22) obj, C7151vE1.a));
                    c0246a.e = 1;
                    if (this.d.a(boolValueOf, c0246a) == mn) {
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

        public a(C1621Nn1 c1621Nn1) {
            this.d = c1621Nn1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new C0245a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C2860b22(@NotNull S02<?> trader) {
        Intrinsics.checkNotNullParameter(trader, "trader");
        this.a = trader.y;
        this.b = C4466ii.E(new a(trader.M), C3784fT.a, IK1.a.a, Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC2636a22
    @NotNull
    public final C1699On1 a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2636a22
    @NotNull
    public final C1699On1 b() {
        return this.a;
    }
}
