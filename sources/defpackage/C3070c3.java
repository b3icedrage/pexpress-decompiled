package defpackage;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3070c3 extends AbstractC2861b3 {

    @NotNull
    public final InterfaceC3350dO d;

    @NotNull
    public final EnumMap<V3, InterfaceC3907g21<Boolean>> e;

    @NotNull
    public final b f;

    @NotNull
    public final C1621Nn1 g;

    /* JADX INFO: renamed from: c3$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0[] d;

        /* JADX INFO: renamed from: c3$a$a, reason: collision with other inner class name */
        public static final class C0259a extends ML0 implements Function0<Boolean[]> {
            public final /* synthetic */ InterfaceC6396rf0[] d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0259a(InterfaceC6396rf0[] interfaceC6396rf0Arr) {
                super(0);
                this.d = interfaceC6396rf0Arr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean[] invoke() {
                return new Boolean[this.d.length];
            }
        }

        /* JADX INFO: renamed from: c3$a$b */
        @InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonViewModelBase$special$$inlined$combine$1$3", f = "AccountCommonViewModelBase.kt", l = {288}, m = "invokeSuspend")
        public static final class b extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super Boolean>, Boolean[], JM<? super Unit>, Object> {
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
                b bVar = new b(3, jm);
                bVar.e = interfaceC6606sf0;
                bVar.g = boolArr;
                return bVar.invokeSuspend(Unit.a);
            }
        }

        public a(InterfaceC6396rf0[] interfaceC6396rf0Arr) {
            this.d = interfaceC6396rf0Arr;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            InterfaceC6396rf0[] interfaceC6396rf0Arr = this.d;
            Object objA = C4372iF.a(jm, interfaceC6606sf0, new b(3, null), new C0259a(interfaceC6396rf0Arr), interfaceC6396rf0Arr);
            return objA == MN.d ? objA : Unit.a;
        }
    }

    /* JADX INFO: renamed from: c3$b */
    public static final class b implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ a d;

        /* JADX INFO: renamed from: c3$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: c3$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonViewModelBase$special$$inlined$filter$1$2", f = "AccountCommonViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0260a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0260a(JM jm) {
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
                C0260a c0260a;
                if (jm instanceof C0260a) {
                    c0260a = (C0260a) jm;
                    int i = c0260a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0260a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0260a = new C0260a(jm);
                    }
                } else {
                    c0260a = new C0260a(jm);
                }
                Object obj2 = c0260a.d;
                MN mn = MN.d;
                int i2 = c0260a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c0260a.e = 1;
                        if (this.d.a(obj, c0260a) == mn) {
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

        public b(a aVar) {
            this.d = aVar;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C3070c3(@NotNull InterfaceC3350dO countryListPreloader, @NotNull C4612j90 eventsFlowsProvider) {
        Intrinsics.checkNotNullParameter(countryListPreloader, "countryListPreloader");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        this.d = countryListPreloader;
        V3 v3 = V3.d;
        Boolean bool = Boolean.FALSE;
        EnumMap<V3, InterfaceC3907g21<Boolean>> enumMap = new EnumMap<>((Map<K, ? extends InterfaceC3907g21<Boolean>>) PW0.e(new Pair(v3, C1589Ne.i(bool)), new Pair(V3.e, C1589Ne.i(bool)), new Pair(V3.g, C1589Ne.i(bool)), new Pair(V3.h, C1589Ne.i(bool))));
        this.e = enumMap;
        Collection<InterfaceC3907g21<Boolean>> collectionValues = enumMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        this.f = new b(new a((InterfaceC6396rf0[]) CollectionsKt.e0(collectionValues).toArray(new InterfaceC6396rf0[0])));
        this.g = eventsFlowsProvider.u;
    }

    @Override // defpackage.C7576xG
    public final void j() {
        this.d.a();
    }

    @Override // defpackage.AbstractC2861b3
    @NotNull
    public final InterfaceC6396rf0<Boolean> l() {
        return this.f;
    }

    @Override // defpackage.AbstractC2861b3
    @NotNull
    public final C1621Nn1 m() {
        return this.g;
    }

    @Override // defpackage.AbstractC2861b3
    public final void n(@NotNull V3 part) {
        Intrinsics.checkNotNullParameter(part, "part");
        InterfaceC3907g21<Boolean> interfaceC3907g21 = this.e.get(part);
        if (interfaceC3907g21 != null) {
            interfaceC3907g21.setValue(Boolean.TRUE);
        }
    }
}
