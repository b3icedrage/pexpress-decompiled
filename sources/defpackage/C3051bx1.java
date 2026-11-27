package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3051bx1 implements InterfaceC7295vw0 {

    @NotNull
    public final AbstractC2199Uy0 a;

    @NotNull
    public final C6256qz1 b;

    @NotNull
    public final C3990gR1 c;

    @NotNull
    public final InterfaceC6396rf0<String> d;

    @NotNull
    public final List<C1491Lx0> e;

    @NotNull
    public final InterfaceC6396rf0<List<C2846az0>> f;

    @NotNull
    public final C1699On1 g;

    @NotNull
    public final InterfaceC6396rf0<InterfaceC7722xy0<?>> h;

    @NotNull
    public final List<String> i;

    /* JADX INFO: renamed from: bx1$a */
    public static final class a implements InterfaceC6396rf0<Pair<? extends InterfaceC7722xy0<? extends E10.c>, ? extends String>> {
        public final /* synthetic */ C6610sg0 d;
        public final /* synthetic */ AbstractC0637Ay0 e;

        /* JADX INFO: renamed from: bx1$a$a, reason: collision with other inner class name */
        public static final class C0255a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ AbstractC0637Ay0 e;

            /* JADX INFO: renamed from: bx1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.indicators.RobotIndicatorProvider$_listIndicatorsWithParams$lambda$3$$inlined$map$1$2", f = "RobotIndicatorProvider.kt", l = {219}, m = "emit")
            public static final class C0256a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0256a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0255a.this.a(null, this);
                }
            }

            public C0255a(InterfaceC6606sf0 interfaceC6606sf0, AbstractC0637Ay0 abstractC0637Ay0) {
                this.d = interfaceC6606sf0;
                this.e = abstractC0637Ay0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0256a c0256a;
                if (jm instanceof C0256a) {
                    c0256a = (C0256a) jm;
                    int i = c0256a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0256a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0256a = new C0256a(jm);
                    }
                } else {
                    c0256a = new C0256a(jm);
                }
                Object obj2 = c0256a.d;
                MN mn = MN.d;
                int i2 = c0256a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Pair pair = new Pair((InterfaceC7722xy0) obj, this.e.c().d);
                    c0256a.e = 1;
                    if (this.d.a(pair, c0256a) == mn) {
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

        public a(C6610sg0 c6610sg0, AbstractC0637Ay0 abstractC0637Ay0) {
            this.d = c6610sg0;
            this.e = abstractC0637Ay0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Pair<? extends InterfaceC7722xy0<? extends E10.c>, ? extends String>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0255a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: bx1$b */
    @InterfaceC3368dU(c = "com.api.feature.trading.indicators.RobotIndicatorProvider$fullList$1", f = "RobotIndicatorProvider.kt", l = {73}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1216Ij0<String, Boolean, Boolean, List<? extends C2846az0>, JM<? super List<? extends C2846az0>>, Object> {
        public int d;
        public /* synthetic */ Serializable e;
        public /* synthetic */ boolean g;
        public /* synthetic */ List h;
        public final /* synthetic */ C3051bx1 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JM jm, C3051bx1 c3051bx1) {
            super(5, jm);
            this.i = c3051bx1;
        }

        @Override // defpackage.InterfaceC1216Ij0
        public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj3).getClass();
            b bVar = new b((JM) serializable, this.i);
            bVar.e = (String) obj;
            bVar.g = zBooleanValue;
            bVar.h = (List) obj4;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[RETURN] */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object objM;
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.e;
                C1795Pt1.b(obj);
                return list;
            }
            C1795Pt1.b(obj);
            String str = (String) this.e;
            boolean z = this.g;
            List<C2846az0> list2 = this.h;
            ArrayList arrayList = new ArrayList(XE.m(list2, 10));
            for (C2846az0 c2846az0 : list2) {
                C1491Lx0 c1491Lx0 = c2846az0.a;
                arrayList.add(new C2846az0(C1491Lx0.a(c1491Lx0, Intrinsics.a(c1491Lx0.b, str), !z && c2846az0.a.a == EnumC2868b42.d, 40959), null, true));
            }
            C3051bx1 c3051bx1 = this.i;
            c3051bx1.getClass();
            if (arrayList.isEmpty()) {
                this.e = arrayList;
                this.d = 1;
                objM = c3051bx1.a.m(new C3260cx1(1, null), this);
                if (objM != MN.d) {
                    objM = Unit.a;
                }
                if (objM == mn) {
                    return mn;
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C2846az0) it.next()).a.k) {
                        if (arrayList.isEmpty()) {
                            break;
                        }
                    }
                }
                this.e = arrayList;
                this.d = 1;
                objM = c3051bx1.a.m(new C3260cx1(1, null), this);
                if (objM != MN.d) {
                    objM = Unit.a;
                }
                if (objM == mn) {
                    return mn;
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: bx1$c */
    @InterfaceC3368dU(c = "com.api.feature.trading.indicators.RobotIndicatorProvider$selectedParams$1", f = "RobotIndicatorProvider.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements InterfaceC1060Gj0<String, List<? extends C2846az0>, JM<? super InterfaceC7722xy0<?>>, Object> {
        public /* synthetic */ String d;
        public /* synthetic */ List e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object next;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            String str = this.d;
            Iterator it = this.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.a(((C2846az0) next).a.b, str));
            C2846az0 c2846az0 = (C2846az0) next;
            if (c2846az0 != null) {
                return c2846az0.b;
            }
            return null;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(String str, List<? extends C2846az0> list, JM<? super InterfaceC7722xy0<?>> jm) {
            c cVar = new c(3, jm);
            cVar.d = str;
            cVar.e = list;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: bx1$d */
    public static final class d implements InterfaceC6396rf0<List<? extends C2846az0>> {
        public final /* synthetic */ InterfaceC6396rf0[] d;
        public final /* synthetic */ C3051bx1 e;

        /* JADX INFO: renamed from: bx1$d$a */
        public static final class a extends ML0 implements Function0<Pair<? extends InterfaceC7722xy0<? extends E10.c>, ? extends String>[]> {
            public final /* synthetic */ InterfaceC6396rf0[] d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0[] interfaceC6396rf0Arr) {
                super(0);
                this.d = interfaceC6396rf0Arr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Pair<? extends InterfaceC7722xy0<? extends E10.c>, ? extends String>[] invoke() {
                return new Pair[this.d.length];
            }
        }

        /* JADX INFO: renamed from: bx1$d$b */
        @InterfaceC3368dU(c = "com.api.feature.trading.indicators.RobotIndicatorProvider$special$$inlined$combine$1$3", f = "RobotIndicatorProvider.kt", l = {288}, m = "invokeSuspend")
        public static final class b extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super List<? extends C2846az0>>, Pair<? extends InterfaceC7722xy0<? extends E10.c>, ? extends String>[], JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ InterfaceC6606sf0 e;
            public /* synthetic */ Object[] g;
            public final /* synthetic */ C3051bx1 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JM jm, C3051bx1 c3051bx1) {
                super(3, jm);
                this.h = c3051bx1;
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC7722xy0 interfaceC7722xy0;
                Pair pair;
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    InterfaceC6606sf0 interfaceC6606sf0 = this.e;
                    Pair[] pairArr = (Pair[]) this.g;
                    List<C1491Lx0> list = this.h.e;
                    ArrayList arrayList = new ArrayList(XE.m(list, 10));
                    for (C1491Lx0 c1491Lx0 : list) {
                        int length = pairArr.length;
                        int i2 = 0;
                        while (true) {
                            interfaceC7722xy0 = null;
                            if (i2 >= length) {
                                pair = null;
                                break;
                            }
                            pair = pairArr[i2];
                            if (Intrinsics.a(pair.e, c1491Lx0.b)) {
                                break;
                            }
                            i2++;
                        }
                        if (pair != null) {
                            interfaceC7722xy0 = (InterfaceC7722xy0) pair.d;
                        }
                        arrayList.add(new C2846az0(c1491Lx0, interfaceC7722xy0, false));
                    }
                    this.d = 1;
                    if (interfaceC6606sf0.a(arrayList, this) == mn) {
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
            public final Object k(InterfaceC6606sf0<? super List<? extends C2846az0>> interfaceC6606sf0, Pair<? extends InterfaceC7722xy0<? extends E10.c>, ? extends String>[] pairArr, JM<? super Unit> jm) {
                b bVar = new b(jm, this.h);
                bVar.e = interfaceC6606sf0;
                bVar.g = pairArr;
                return bVar.invokeSuspend(Unit.a);
            }
        }

        public d(InterfaceC6396rf0[] interfaceC6396rf0Arr, C3051bx1 c3051bx1) {
            this.d = interfaceC6396rf0Arr;
            this.e = c3051bx1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C2846az0>> interfaceC6606sf0, @NotNull JM jm) {
            InterfaceC6396rf0[] interfaceC6396rf0Arr = this.d;
            Object objA = C4372iF.a(jm, interfaceC6606sf0, new b(null, this.e), new a(interfaceC6396rf0Arr), interfaceC6396rf0Arr);
            return objA == MN.d ? objA : Unit.a;
        }
    }

    /* JADX INFO: renamed from: bx1$e */
    public static final class e implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: bx1$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: bx1$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.indicators.RobotIndicatorProvider$special$$inlined$map$1$2", f = "RobotIndicatorProvider.kt", l = {219}, m = "emit")
            public static final class C0257a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0257a(JM jm) {
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
                C0257a c0257a;
                if (jm instanceof C0257a) {
                    c0257a = (C0257a) jm;
                    int i = c0257a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0257a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0257a = new C0257a(jm);
                    }
                } else {
                    c0257a = new C0257a(jm);
                }
                Object obj2 = c0257a.d;
                MN mn = MN.d;
                int i2 = c0257a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((List) obj).isEmpty());
                    c0257a.e = 1;
                    if (this.d.a(boolValueOf, c0257a) == mn) {
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

        public e(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C3051bx1(@NotNull Context context, @NotNull C4923kf appData, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull Nm2 indicatorsLocalDataProvider, @NotNull Set<AbstractC0637Ay0<?, ?>> indicators, @NotNull C6348rR experimentsProviderApi, @NotNull C6256qz1 robotShowUnlockAllBottomSheetLocalExperiment, @NotNull C3990gR1 strategiesImprovementLocalExperiment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(indicatorsLocalDataProvider, "indicatorsLocalDataProvider");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        Intrinsics.checkNotNullParameter(robotShowUnlockAllBottomSheetLocalExperiment, "robotShowUnlockAllBottomSheetLocalExperiment");
        Intrinsics.checkNotNullParameter(strategiesImprovementLocalExperiment, "strategiesImprovementLocalExperiment");
        this.a = indicatorUseCase;
        this.b = robotShowUnlockAllBottomSheetLocalExperiment;
        this.c = strategiesImprovementLocalExperiment;
        this.d = indicatorUseCase.l();
        indicatorsLocalDataProvider.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC2868b42 enumC2868b42 = EnumC2868b42.d;
        CR0 cr0 = CR0.ADX;
        String strE = Nm2.e("ai_circle");
        String strC = Nm2.c("ai_illustration");
        String string = context.getString(R.string.ai_indicator_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.ai_indicator_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C1491Lx0 c1491Lx0 = new C1491Lx0(enumC2868b42, "summary", strE, strC, string, string2, Integer.valueOf(R.string.ai_indicator_text), Integer.valueOf(R.string.ai_indicator_description), VE.c(EnumC2121Ty0.j), true, 58176);
        EnumC2868b42 enumC2868b43 = EnumC2868b42.e;
        String strE2 = Nm2.e("macd");
        String strC2 = Nm2.c("macd");
        String string3 = context.getString(R.string.indicator_macd_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C1491Lx0 c1491Lx1 = new C1491Lx0(enumC2868b43, "macd", strE2, strC2, string3, null, Integer.valueOf(R.string.indicator_macd_text), Integer.valueOf(R.string.macd_text), VE.c(EnumC2121Ty0.i), true, 58208);
        String strE3 = Nm2.e("stoch");
        String strC3 = Nm2.c("stoch");
        String string4 = context.getString(R.string.indicator_stoch_title);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        EnumC2121Ty0 enumC2121Ty0 = EnumC2121Ty0.h;
        C1491Lx0 c1491Lx2 = new C1491Lx0(enumC2868b43, "stoch", strE3, strC3, string4, null, Integer.valueOf(R.string.indicator_stoch_text), Integer.valueOf(R.string.stochastic_text), VE.c(enumC2121Ty0), true, 58208);
        C1491Lx0 c1491Lx3 = new C1491Lx0(enumC2868b43, "bb", Nm2.e("bb"), Nm2.c("bb"), "Bollinger Bands", null, Integer.valueOf(R.string.description_bb), Integer.valueOf(R.string.bb_text), VE.c(enumC2121Ty0), true, 58208);
        String strE4 = Nm2.e("rsi");
        String strC4 = Nm2.c("rsi");
        String string5 = context.getString(R.string.indicator_rsi_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        this.e = WE.f(c1491Lx0, c1491Lx1, c1491Lx2, c1491Lx3, new C1491Lx0(enumC2868b43, "rsi", strE4, strC4, string5, null, Integer.valueOf(R.string.indicator_rsi_text), Integer.valueOf(R.string.rsi_text), VE.c(enumC2121Ty0), true, 58208), new C1491Lx0(enumC2868b43, "cci", Nm2.e("cci"), Nm2.c("cci"), "CCI", null, Integer.valueOf(R.string.description_cci), Integer.valueOf(R.string.cci_text), VE.c(enumC2121Ty0), true, 58208), Nm2.b(context));
        ArrayList<AbstractC0637Ay0> arrayList = new ArrayList();
        for (Object obj : indicators) {
            AbstractC0637Ay0 abstractC0637Ay0 = (AbstractC0637Ay0) obj;
            List<C1491Lx0> list = this.e;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (abstractC0637Ay0.c().d.equals(((C1491Lx0) it.next()).b)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        for (AbstractC0637Ay0 abstractC0637Ay1 : arrayList) {
            arrayList2.add(new a(abstractC0637Ay1.d(), abstractC0637Ay1));
        }
        d dVar = new d((InterfaceC6396rf0[]) CollectionsKt.e0(arrayList2).toArray(new InterfaceC6396rf0[0]), this);
        InterfaceC6396rf0<List<C2846az0>> interfaceC6396rf0M = C4466ii.m(C4466ii.l(this.d, appData.e, experimentsProviderApi.c, dVar, new b(null, this)));
        this.f = interfaceC6396rf0M;
        this.g = C4466ii.E(new e(interfaceC6396rf0M), C3784fT.a, IK1.a.b, Boolean.TRUE);
        this.h = C4466ii.m(new C6610sg0(this.d, dVar, new c(3, null)));
        CR0 cr1 = CR0.ADX;
        this.i = WE.f("summary", "macd", "stoch", "rsi", "close_price");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o60] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() {
        ?? arrayList;
        ?? arrayList2;
        C3990gR1 c3990gR1 = this.c;
        boolean zO = c3990gR1.o();
        List<C1491Lx0> list = this.e;
        if (zO) {
            arrayList = new ArrayList(XE.m(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1491Lx0) it.next()).c);
            }
        } else {
            arrayList = C5653o60.d;
        }
        if (c3990gR1.o()) {
            arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = ((C1491Lx0) it2.next()).d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
        } else {
            arrayList2 = C5653o60.d;
        }
        return new C1021Fw0(CollectionsKt.Q(CollectionsKt.Q(arrayList, arrayList2), this.b.o() ? VE.c("https://assets.pbotservices.com/images/indicators.png") : C5653o60.d), null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return EnumC7035uh1.h;
    }
}
