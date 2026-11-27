package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5316mW1 extends AbstractC6365rW1 {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final InterfaceC0565Aa0 f;

    @NotNull
    public final InterfaceC4234hc0 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final C1699On1 i;

    @NotNull
    public final EnumMap<QV1, InterfaceC3907g21<Boolean>> j;

    @NotNull
    public final c k;

    /* JADX INFO: renamed from: mW1$a */
    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportViewModelBase$1", f = "SupportViewModelBase.kt", l = {42, 43}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C5316mW1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C5316mW1 c5316mW1 = C5316mW1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (C5316mW1.m(c5316mW1, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                    return Unit.a;
                }
                C1795Pt1.b(obj);
            }
            this.d = 2;
            C5316mW1.l(c5316mW1, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: mW1$b */
    public static final class b implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0[] d;

        /* JADX INFO: renamed from: mW1$b$a */
        public static final class a extends ML0 implements Function0<Boolean[]> {
            public final /* synthetic */ InterfaceC6396rf0[] d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0[] interfaceC6396rf0Arr) {
                super(0);
                this.d = interfaceC6396rf0Arr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean[] invoke() {
                return new Boolean[this.d.length];
            }
        }

        /* JADX INFO: renamed from: mW1$b$b, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportViewModelBase$special$$inlined$combine$1$3", f = "SupportViewModelBase.kt", l = {288}, m = "invokeSuspend")
        public static final class C0441b extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super Boolean>, Boolean[], JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ InterfaceC6606sf0 e;
            public /* synthetic */ Object[] g;

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    InterfaceC6606sf0 interfaceC6606sf0 = this.e;
                    Boolean[] boolArr = (Boolean[]) this.g;
                    int length = boolArr.length;
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = true;
                            break;
                        }
                        if (!boolArr[i2].booleanValue()) {
                            break;
                        }
                        i2++;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.d = 1;
                    if (interfaceC6606sf0.a(boolValueOf, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }

            @Override // defpackage.InterfaceC1060Gj0
            public final Object k(InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, Boolean[] boolArr, JM<? super Unit> jm) {
                C0441b c0441b = new C0441b(3, jm);
                c0441b.e = interfaceC6606sf0;
                c0441b.g = boolArr;
                return c0441b.invokeSuspend(Unit.a);
            }
        }

        public b(InterfaceC6396rf0[] interfaceC6396rf0Arr) {
            this.d = interfaceC6396rf0Arr;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            InterfaceC6396rf0[] interfaceC6396rf0Arr = this.d;
            Object objA = C4372iF.a(jm, interfaceC6606sf0, new C0441b(3, null), new a(interfaceC6396rf0Arr), interfaceC6396rf0Arr);
            return objA == MN.d ? objA : Unit.a;
        }
    }

    /* JADX INFO: renamed from: mW1$c */
    public static final class c implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ b d;

        /* JADX INFO: renamed from: mW1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: mW1$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportViewModelBase$special$$inlined$filter$1$2", f = "SupportViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0442a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0442a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0442a c0442a;
                if (jm instanceof C0442a) {
                    c0442a = (C0442a) jm;
                    int i = c0442a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0442a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0442a = new C0442a(jm);
                    }
                } else {
                    c0442a = new C0442a(jm);
                }
                Object obj2 = c0442a.d;
                MN mn = MN.d;
                int i2 = c0442a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c0442a.e = 1;
                        if (this.d.a(obj, c0442a) == mn) {
                            return mn;
                        }
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

        public c(b bVar) {
            this.d = bVar;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C5316mW1(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC0565Aa0 experimentsProviderApi, @NotNull InterfaceC4234hc0 fetchKnowledgeBaseValuesUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        Intrinsics.checkNotNullParameter(fetchKnowledgeBaseValuesUseCase, "fetchKnowledgeBaseValuesUseCase");
        this.d = appData;
        this.e = reporter;
        this.f = experimentsProviderApi;
        this.g = fetchKnowledgeBaseValuesUseCase;
        QV1 qv1 = QV1.g;
        QV1 qv2 = QV1.h;
        GP1 gp1I = C1589Ne.i(WE.f(qv1, qv2));
        this.h = gp1I;
        this.i = C4466ii.f(gp1I);
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
        C6561sS.g(this, new C5526nW1(this, null));
        QV1 qv3 = QV1.d;
        Boolean bool = Boolean.FALSE;
        EnumMap<QV1, InterfaceC3907g21<Boolean>> enumMap = new EnumMap<>((Map<K, ? extends InterfaceC3907g21<Boolean>>) PW0.e(new Pair(qv3, C1589Ne.i(bool)), new Pair(QV1.e, C1589Ne.i(bool)), new Pair(qv2, C1589Ne.i(bool)), new Pair(qv1, C1589Ne.i(bool))));
        this.j = enumMap;
        Collection<InterfaceC3907g21<Boolean>> collectionValues = enumMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        this.k = new c(new b((InterfaceC6396rf0[]) CollectionsKt.e0(collectionValues).toArray(new InterfaceC6396rf0[0])));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final void l(C5316mW1 c5316mW1, LM lm) {
        C5736oW1 c5736oW1;
        c5316mW1.getClass();
        if (lm instanceof C5736oW1) {
            c5736oW1 = (C5736oW1) lm;
            int i = c5736oW1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5736oW1.g = i - Integer.MIN_VALUE;
            } else {
                c5736oW1 = new C5736oW1(c5316mW1, lm);
            }
        } else {
            c5736oW1 = new C5736oW1(c5316mW1, lm);
        }
        Object obj = c5736oW1.d;
        MN mn = MN.d;
        int i2 = c5736oW1.g;
        if (i2 != 0) {
            if (i2 == 1) {
                throw EK.c(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        GP1 gp1 = c5316mW1.d.e;
        C5946pW1 c5946pW1 = new C5946pW1(c5316mW1);
        c5736oW1.g = 1;
        gp1.c(c5946pW1, c5736oW1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object m(C5316mW1 c5316mW1, LM lm) {
        C6156qW1 c6156qW1;
        c5316mW1.getClass();
        if (lm instanceof C6156qW1) {
            c6156qW1 = (C6156qW1) lm;
            int i = c6156qW1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6156qW1.h = i - Integer.MIN_VALUE;
            } else {
                c6156qW1 = new C6156qW1(c5316mW1, lm);
            }
        } else {
            c6156qW1 = new C6156qW1(c5316mW1, lm);
        }
        Object objA = c6156qW1.e;
        Object obj = MN.d;
        int i2 = c6156qW1.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c6156qW1.d = c5316mW1;
            c6156qW1.h = 1;
            objA = JK0.a(c5316mW1.f, c6156qW1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5316mW1 = c6156qW1.d;
            C1795Pt1.b(objA);
        }
        if (objA != HK0.CONTROL_GROUP) {
            c5316mW1.h.setValue(VE.c(QV1.e));
        }
        return Unit.a;
    }
}
