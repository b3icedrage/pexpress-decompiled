package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7978zA implements InterfaceC7768yA {

    @NotNull
    public final InterfaceC6396rf0<C3279d22> a;

    @NotNull
    public final b b;

    /* JADX INFO: renamed from: zA$a */
    @InterfaceC3368dU(c = "com.base.feature.graphic.providers.ChartAssetProviderBase$currentAsset$1", f = "ChartAssetProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<C3279d22, C3279d22, Boolean, JM<? super C3279d22>, Object> {
        public /* synthetic */ C3279d22 d;
        public /* synthetic */ C3279d22 e;
        public /* synthetic */ boolean g;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3279d22 c3279d22 = this.d;
            C3279d22 c3279d23 = this.e;
            return (!this.g || c3279d23 == null) ? c3279d22 : c3279d23;
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(C3279d22 c3279d22, C3279d22 c3279d23, Boolean bool, JM<? super C3279d22> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(4, jm);
            aVar.d = c3279d22;
            aVar.e = c3279d23;
            aVar.g = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: zA$b */
    public static final class b implements InterfaceC6396rf0<String> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ AbstractC7978zA e;

        /* JADX INFO: renamed from: zA$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ AbstractC7978zA e;

            /* JADX INFO: renamed from: zA$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.graphic.providers.ChartAssetProviderBase$special$$inlined$map$1$2", f = "ChartAssetProviderBase.kt", l = {219}, m = "emit")
            public static final class C0548a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0548a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0, AbstractC7978zA abstractC7978zA) {
                this.d = interfaceC6606sf0;
                this.e = abstractC7978zA;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0548a c0548a;
                if (jm instanceof C0548a) {
                    c0548a = (C0548a) jm;
                    int i = c0548a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0548a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0548a = new C0548a(jm);
                    }
                } else {
                    c0548a = new C0548a(jm);
                }
                Object obj2 = c0548a.d;
                MN mn = MN.d;
                int i2 = c0548a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C3279d22 c3279d22 = (C3279d22) obj;
                    ((AA) this.e).getClass();
                    Intrinsics.checkNotNullParameter(c3279d22, "<this>");
                    String strValueOf = String.valueOf(c3279d22.a);
                    c0548a.e = 1;
                    if (this.d.a(strValueOf, c0548a) == mn) {
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

        public b(InterfaceC6396rf0 interfaceC6396rf0, AbstractC7978zA abstractC7978zA) {
            this.d = interfaceC6396rf0;
            this.e = abstractC7978zA;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public AbstractC7978zA(@NotNull AbstractC7949z22 assetsProvider, @NotNull S02<?> trader) {
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(trader, "trader");
        InterfaceC6396rf0<C3279d22> interfaceC6396rf0M = C4466ii.m(C4466ii.k(new C4250hg0(assetsProvider.o, 0), C4466ii.E(trader.I, C3784fT.a, IK1.a.a, null), trader.y, new a(4, null)));
        this.a = interfaceC6396rf0M;
        this.b = new b(interfaceC6396rf0M, this);
    }

    @Override // defpackage.InterfaceC7768yA
    @NotNull
    public final b a() {
        return this.b;
    }
}
