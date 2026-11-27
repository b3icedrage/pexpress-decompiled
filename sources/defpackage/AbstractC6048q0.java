package defpackage;

import E10.c;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.InterfaceC7722xy0;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6048q0<T extends E10.c, P extends InterfaceC7722xy0<T>> implements E10 {

    @NotNull
    public final InterfaceC6444rs1 b;

    @NotNull
    public final InterfaceC4270hl0 c;

    @NotNull
    public final C4953km1 d;

    @NotNull
    public final AbstractC7949z22 e;

    @NotNull
    public final InterfaceC4209hU1 f;

    @NotNull
    public final AbstractC0637Ay0<T, P> g;

    @NotNull
    public final C3372dV0 h;

    @NotNull
    public final C3372dV0 i;

    /* JADX INFO: renamed from: q0$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {73}, m = "calculateDirection")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int g;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return AbstractC6048q0.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: q0$b */
    @InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {203}, m = "getRandomDirection")
    public static final class b extends LM {
        public /* synthetic */ Object d;
        public final /* synthetic */ AbstractC6048q0<T, P> e;
        public int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC6048q0<T, P> abstractC6048q0, JM<? super b> jm) {
            super(jm);
            this.e = abstractC6048q0;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return this.e.k(this);
        }
    }

    public AbstractC6048q0(@NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomCalculator, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull AbstractC0637Ay0<T, P> indicatorParamsProvider) {
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomCalculator, "randomCalculator");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(indicatorParamsProvider, "indicatorParamsProvider");
        this.b = requestCandlesHistoryUseCase;
        this.c = getPlatformTimeUseCase;
        this.d = randomCalculator;
        this.e = tradingAssetsProvider;
        this.f = subscribeToValueUpdatesUseCase;
        this.g = indicatorParamsProvider;
        this.h = new C3372dV0();
        this.i = new C3372dV0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object e(AbstractC6048q0 abstractC6048q0, I10 i10, LM lm) {
        C6467s0 c6467s0;
        AbstractC6048q0 abstractC6048q1;
        InterfaceC7722xy0 interfaceC7722xy0;
        List list;
        Object objD;
        Object objK;
        if (lm instanceof C6467s0) {
            c6467s0 = (C6467s0) lm;
            int i = c6467s0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6467s0.j = i - Integer.MIN_VALUE;
            } else {
                c6467s0 = new C6467s0(abstractC6048q0, lm);
            }
        } else {
            c6467s0 = new C6467s0(abstractC6048q0, lm);
        }
        Object objO = c6467s0.h;
        MN mn = MN.d;
        int i2 = c6467s0.j;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C6610sg0 c6610sg0D = abstractC6048q0.g.d();
            c6467s0.d = abstractC6048q0;
            c6467s0.e = i10;
            c6467s0.j = 1;
            objO = C4466ii.o(c6610sg0D, c6467s0);
            if (objO != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            i10 = c6467s0.e;
            abstractC6048q0 = c6467s0.d;
            C1795Pt1.b(objO);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    C1795Pt1.b(objO);
                    return objO;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objO);
                return objO;
            }
            interfaceC7722xy0 = c6467s0.g;
            i10 = c6467s0.e;
            abstractC6048q1 = c6467s0.d;
            C1795Pt1.b(objO);
        }
        list = (List) objO;
        if (list.size() < interfaceC7722xy0.a()) {
            abstractC6048q1.getClass();
            E10.b.b(abstractC6048q1, "candles history is too small or empty, check webSocket response");
            c6467s0.d = null;
            c6467s0.e = null;
            c6467s0.g = null;
            c6467s0.j = 3;
            objK = abstractC6048q1.k(c6467s0);
            if (objK == mn) {
                return objK;
            }
        } else {
            c6467s0.d = null;
            c6467s0.e = null;
            c6467s0.g = null;
            c6467s0.j = 4;
            objD = abstractC6048q1.d(list, i10, c6467s0);
            if (objD == mn) {
                return objD;
            }
        }
        return mn;
        InterfaceC7722xy0 interfaceC7722xy1 = (InterfaceC7722xy0) objO;
        c6467s0.d = abstractC6048q0;
        c6467s0.e = i10;
        c6467s0.g = interfaceC7722xy1;
        c6467s0.j = 2;
        Serializable serializableJ = abstractC6048q0.j(i10, interfaceC7722xy1, c6467s0);
        if (serializableJ != mn) {
            abstractC6048q1 = abstractC6048q0;
            interfaceC7722xy0 = interfaceC7722xy1;
            objO = serializableJ;
            list = (List) objO;
            if (list.size() < interfaceC7722xy0.a()) {
                abstractC6048q1.getClass();
                E10.b.b(abstractC6048q1, "candles history is too small or empty, check webSocket response");
                c6467s0.d = null;
                c6467s0.e = null;
                c6467s0.g = null;
                c6467s0.j = 3;
                objK = abstractC6048q1.k(c6467s0);
                if (objK == mn) {
                    return objK;
                }
            } else {
                c6467s0.d = null;
                c6467s0.e = null;
                c6467s0.g = null;
                c6467s0.j = 4;
                objD = abstractC6048q1.d(list, i10, c6467s0);
                if (objD == mn) {
                    return objD;
                }
            }
        }
        return mn;
    }

    @Override // defpackage.E10
    @Nullable
    public Object b(@NotNull I10 i10, @NotNull LM lm) {
        return e(this, i10, lm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.E10
    @Nullable
    public final Object c(@NotNull I10 i10, @NotNull JM<? super H32.a> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object objB = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            aVar.g = 1;
            objB = b(i10, aVar);
            if (objB == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        return ((O10) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00c8, please report this as an issue */
    @Nullable
    public final Object d(@NotNull List list, @NotNull I10 i10, @NotNull LM lm) {
        C6257r0 c6257r0;
        AbstractC6048q0 abstractC6048q0;
        I10 i11;
        InterfaceC7722xy0 interfaceC7722xy0;
        E10.c cVarC;
        InterfaceC7722xy0 interfaceC7722xy1;
        E10.c cVar;
        EnumC2107Tt1 enumC2107Tt1;
        Object objK;
        Object objG;
        if (lm instanceof C6257r0) {
            c6257r0 = (C6257r0) lm;
            int i = c6257r0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6257r0.j = i - Integer.MIN_VALUE;
            } else {
                c6257r0 = new C6257r0(this, lm);
            }
        } else {
            c6257r0 = new C6257r0(this, lm);
        }
        C6257r0 c6257r1 = c6257r0;
        Object objO = c6257r1.h;
        MN mn = MN.d;
        int i2 = c6257r1.j;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objO);
                C6610sg0 c6610sg0D = this.g.d();
                c6257r1.d = this;
                c6257r1.e = list;
                c6257r1.g = i10;
                c6257r1.j = 1;
                objO = C4466ii.o(c6610sg0D, c6257r1);
                if (objO != mn) {
                    abstractC6048q0 = this;
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C1795Pt1.b(objO);
                        return objO;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(objO);
                    return objO;
                }
                cVar = (E10.c) c6257r1.g;
                interfaceC7722xy1 = (InterfaceC7722xy0) c6257r1.e;
                abstractC6048q0 = c6257r1.d;
                try {
                    C1795Pt1.b(objO);
                    enumC2107Tt1 = (EnumC2107Tt1) objO;
                } catch (Exception unused) {
                    enumC2107Tt1 = EnumC2107Tt1.g;
                }
                abstractC6048q0.getClass();
                E10.b.b(abstractC6048q0, "proceeding result: " + enumC2107Tt1);
                if (enumC2107Tt1 == EnumC2107Tt1.d) {
                    c6257r1.d = null;
                    c6257r1.e = null;
                    c6257r1.g = null;
                    c6257r1.j = 3;
                    objG = abstractC6048q0.g(cVar, interfaceC7722xy1, c6257r1);
                    if (objG == mn) {
                        return objG;
                    }
                } else {
                    E10.b.b(abstractC6048q0, "outBegIdx -> " + abstractC6048q0.h.a);
                    E10.b.b(abstractC6048q0, "outLength -> " + abstractC6048q0.i.a);
                    c6257r1.d = null;
                    c6257r1.e = null;
                    c6257r1.g = null;
                    c6257r1.j = 4;
                    objK = abstractC6048q0.k(c6257r1);
                    if (objK == mn) {
                        return objK;
                    }
                }
                return mn;
            }
            i10 = (I10) c6257r1.g;
            list = (List) c6257r1.e;
            abstractC6048q0 = c6257r1.d;
            C1795Pt1.b(objO);
            List listB0 = CollectionsKt.b0(interfaceC7722xy0.a(), list);
            c6257r1.d = abstractC6048q0;
            c6257r1.e = interfaceC7722xy0;
            c6257r1.g = cVarC;
            c6257r1.j = 2;
            objO = abstractC6048q0.m(listB0, i11, interfaceC7722xy0, cVarC, c6257r1);
            if (objO != mn) {
                interfaceC7722xy1 = interfaceC7722xy0;
                cVar = cVarC;
                enumC2107Tt1 = (EnumC2107Tt1) objO;
                abstractC6048q0.getClass();
                E10.b.b(abstractC6048q0, "proceeding result: " + enumC2107Tt1);
                if (enumC2107Tt1 == EnumC2107Tt1.d) {
                    c6257r1.d = null;
                    c6257r1.e = null;
                    c6257r1.g = null;
                    c6257r1.j = 3;
                    objG = abstractC6048q0.g(cVar, interfaceC7722xy1, c6257r1);
                    if (objG == mn) {
                        return objG;
                    }
                } else {
                    E10.b.b(abstractC6048q0, "outBegIdx -> " + abstractC6048q0.h.a);
                    E10.b.b(abstractC6048q0, "outLength -> " + abstractC6048q0.i.a);
                    c6257r1.d = null;
                    c6257r1.e = null;
                    c6257r1.g = null;
                    c6257r1.j = 4;
                    objK = abstractC6048q0.k(c6257r1);
                    if (objK == mn) {
                        return objK;
                    }
                }
            }
        } catch (Exception unused2) {
            interfaceC7722xy1 = interfaceC7722xy0;
            cVar = cVarC;
            enumC2107Tt1 = EnumC2107Tt1.g;
        }
        i11 = i10;
        interfaceC7722xy0 = (InterfaceC7722xy0) objO;
        cVarC = interfaceC7722xy0.c();
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(I10 i10, InterfaceC7722xy0 interfaceC7722xy0, LM lm) {
        C6677t0 c6677t0;
        if (lm instanceof C6677t0) {
            c6677t0 = (C6677t0) lm;
            int i = c6677t0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6677t0.i = i - Integer.MIN_VALUE;
            } else {
                c6677t0 = new C6677t0(this, lm);
            }
        } else {
            c6677t0 = new C6677t0(this, lm);
        }
        Object objH = c6677t0.g;
        MN mn = MN.d;
        int i2 = c6677t0.i;
        if (i2 == 0) {
            C1795Pt1.b(objH);
            c6677t0.d = i10;
            c6677t0.e = interfaceC7722xy0;
            c6677t0.i = 1;
            objH = h(c6677t0);
            if (objH == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7722xy0 = c6677t0.e;
            i10 = c6677t0.d;
            C1795Pt1.b(objH);
        }
        long jLongValue = ((Number) objH).longValue();
        long j = i10.b;
        kotlin.time.b.a aVar = kotlin.time.b.e;
        return new Long(jLongValue - (kotlin.time.b.r(j, R40.SECONDS) * ((long) (interfaceC7722xy0.a() + 1))));
    }

    @Nullable
    public abstract Object g(@NotNull E10.c cVar, @NotNull InterfaceC7722xy0 interfaceC7722xy0, @NotNull C6257r0 c6257r0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(LM lm) {
        C6887u0 c6887u0;
        if (lm instanceof C6887u0) {
            c6887u0 = (C6887u0) lm;
            int i = c6887u0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6887u0.g = i - Integer.MIN_VALUE;
            } else {
                c6887u0 = new C6887u0(this, lm);
            }
        } else {
            c6887u0 = new C6887u0(this, lm);
        }
        Object objA = c6887u0.d;
        MN mn = MN.d;
        int i2 = c6887u0.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c6887u0.g = 1;
            objA = this.c.a(c6887u0);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        return new Long(((Number) objA).longValue() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
    }

    @NotNull
    public final O10.c i(@NotNull H32.a direction, @NotNull InterfaceC7722xy0 indicatorParam) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        for (Map.Entry<String, Object> entry : l(indicatorParam).entrySet()) {
            E10.b.b(this, entry.getKey() + ": " + entry.getValue());
        }
        E10.b.b(this, "defined direction: " + direction);
        return P10.a(direction);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
    
        if (r3 == r4) goto L29;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(@org.jetbrains.annotations.NotNull defpackage.I10 r18, @org.jetbrains.annotations.NotNull defpackage.InterfaceC7722xy0 r19, @org.jetbrains.annotations.NotNull defpackage.LM r20) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6048q0.j(I10, xy0, LM):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object k(@NotNull JM<? super O10> jm) {
        b bVar;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.g = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, jm);
            }
        } else {
            bVar = new b(this, jm);
        }
        Object obj = bVar.d;
        MN mn = MN.d;
        int i2 = bVar.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            E10.b.b(this, "sending random direction");
            bVar.g = 1;
            C3279d22 c3279d22 = C5163lm1.a;
            kotlin.time.b.e.getClass();
            C3279d22 asset = C5163lm1.a;
            Intrinsics.checkNotNullParameter(asset, "asset");
            AbstractC4743jm1 abstractC4743jm1 = this.d.b;
            Intrinsics.checkNotNullParameter(abstractC4743jm1, "<this>");
            obj = abstractC4743jm1.b() ? H32.a.CALL_UP : H32.a.PUT_DOWN;
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        H32.a aVar = (H32.a) obj;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new O10.b(aVar);
    }

    @NotNull
    public Map<String, Object> l(@NotNull P indicatorParam) {
        Intrinsics.checkNotNullParameter(indicatorParam, "indicatorParam");
        return indicatorParam.b() >= 0 ? OW0.b(new Pair("indicator's default time period", Integer.valueOf(indicatorParam.b()))) : PW0.c();
    }

    @Nullable
    public abstract Object m(@NotNull List list, @NotNull I10 i10, @NotNull InterfaceC7722xy0 interfaceC7722xy0, @NotNull E10.c cVar, @NotNull LM lm);

    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object n(@NotNull I10 i10, @NotNull InterfaceC7722xy0 interfaceC7722xy0, @NotNull C6990uV c6990uV, @NotNull Function1 function1, @NotNull InterfaceC1060Gj0 interfaceC1060Gj0, @NotNull LM lm) {
        C7518x0 c7518x0;
        AbstractC6048q0<T, P> abstractC6048q0;
        I10 i11;
        InterfaceC7722xy0 interfaceC7722xy1;
        E10.c cVar;
        Function1 function2;
        InterfaceC1060Gj0 interfaceC1060Gj1;
        AbstractC6048q0 abstractC6048q1;
        H32.a aVar;
        Object objK;
        if (lm instanceof C7518x0) {
            c7518x0 = (C7518x0) lm;
            int i = c7518x0.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7518x0.m = i - Integer.MIN_VALUE;
            } else {
                c7518x0 = new C7518x0(this, lm);
            }
        } else {
            c7518x0 = new C7518x0(this, lm);
        }
        Object objA = c7518x0.k;
        MN mn = MN.d;
        int i2 = c7518x0.m;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            int iA = interfaceC7722xy0.a();
            c7518x0.d = this;
            c7518x0.e = i10;
            c7518x0.g = interfaceC7722xy0;
            c7518x0.h = c6990uV;
            c7518x0.i = function1;
            c7518x0.j = interfaceC1060Gj0;
            c7518x0.m = 1;
            objA = this.f.a(i10, iA, c7518x0);
            if (objA != mn) {
                abstractC6048q0 = this;
                i11 = i10;
                interfaceC7722xy1 = interfaceC7722xy0;
                cVar = c6990uV;
                function2 = function1;
                interfaceC1060Gj1 = interfaceC1060Gj0;
            }
            return mn;
        }
        if (i2 == 1) {
            InterfaceC1060Gj0 interfaceC1060Gj2 = c7518x0.j;
            Function1 function3 = c7518x0.i;
            E10.c cVar2 = c7518x0.h;
            InterfaceC7722xy0 interfaceC7722xy2 = c7518x0.g;
            I10 i12 = c7518x0.e;
            AbstractC6048q0<T, P> abstractC6048q2 = c7518x0.d;
            C1795Pt1.b(objA);
            interfaceC1060Gj1 = interfaceC1060Gj2;
            function2 = function3;
            cVar = cVar2;
            interfaceC7722xy1 = interfaceC7722xy2;
            i11 = i12;
            abstractC6048q0 = abstractC6048q2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objA);
                return objA;
            }
            abstractC6048q1 = c7518x0.d;
            C1795Pt1.b(objA);
        }
        aVar = (H32.a) objA;
        if (aVar != null) {
            return P10.a(aVar);
        }
        c7518x0.d = null;
        c7518x0.m = 3;
        objK = abstractC6048q1.k(c7518x0);
        if (objK != mn) {
            return mn;
        }
        return objK;
        C3735fC1 c3735fC1 = new C3735fC1(new C7307w0((InterfaceC6396rf0) objA, null, abstractC6048q0, i11, interfaceC7722xy1, cVar, function2, interfaceC1060Gj1));
        c7518x0.d = abstractC6048q0;
        c7518x0.e = null;
        c7518x0.g = null;
        c7518x0.h = null;
        c7518x0.i = null;
        c7518x0.j = null;
        c7518x0.m = 2;
        objA = C4466ii.q(c3735fC1, c7518x0);
        if (objA != mn) {
            abstractC6048q1 = abstractC6048q0;
            aVar = (H32.a) objA;
            if (aVar != null) {
                return P10.a(aVar);
            }
            c7518x0.d = null;
            c7518x0.m = 3;
            objK = abstractC6048q1.k(c7518x0);
            if (objK != mn) {
                return objK;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object o(@NotNull I10 i10, @NotNull InterfaceC7722xy0 interfaceC7722xy0, @NotNull E10.c cVar, @NotNull Function1 function1, @NotNull InterfaceC1138Hj0 interfaceC1138Hj0, @NotNull LM lm) {
        C7938z0 c7938z0;
        I10 i11;
        C3027bp1 c3027bp1;
        InterfaceC7722xy0 interfaceC7722xy1;
        E10.c cVar2;
        Function1 function2;
        InterfaceC1138Hj0 interfaceC1138Hj1;
        AbstractC6048q0<T, P> abstractC6048q0;
        AbstractC6048q0 abstractC6048q1;
        H32.a aVar;
        Object objK;
        if (lm instanceof C7938z0) {
            c7938z0 = (C7938z0) lm;
            int i = c7938z0.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7938z0.n = i - Integer.MIN_VALUE;
            } else {
                c7938z0 = new C7938z0(this, lm);
            }
        } else {
            c7938z0 = new C7938z0(this, lm);
        }
        Object objQ = c7938z0.l;
        MN mn = MN.d;
        int i2 = c7938z0.n;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(objQ);
            int iA = interfaceC7722xy0.a();
            c7938z0.d = this;
            c7938z0.e = i10;
            c7938z0.g = interfaceC7722xy0;
            c7938z0.h = cVar;
            c7938z0.i = function1;
            c7938z0.j = interfaceC1138Hj0;
            c7938z0.k = c3027bp1B;
            c7938z0.n = 1;
            Object objA = this.f.a(i10, iA, c7938z0);
            if (objA != mn) {
                i11 = i10;
                c3027bp1 = c3027bp1B;
                objQ = objA;
                interfaceC7722xy1 = interfaceC7722xy0;
                cVar2 = cVar;
                function2 = function1;
                interfaceC1138Hj1 = interfaceC1138Hj0;
                abstractC6048q0 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            C3027bp1 c3027bp2 = c7938z0.k;
            InterfaceC1138Hj0 interfaceC1138Hj2 = c7938z0.j;
            Function1 function3 = c7938z0.i;
            E10.c cVar3 = c7938z0.h;
            InterfaceC7722xy0 interfaceC7722xy2 = c7938z0.g;
            I10 i12 = c7938z0.e;
            abstractC6048q0 = c7938z0.d;
            C1795Pt1.b(objQ);
            c3027bp1 = c3027bp2;
            interfaceC1138Hj1 = interfaceC1138Hj2;
            function2 = function3;
            cVar2 = cVar3;
            interfaceC7722xy1 = interfaceC7722xy2;
            i11 = i12;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objQ);
                return objQ;
            }
            abstractC6048q1 = c7938z0.d;
            C1795Pt1.b(objQ);
        }
        aVar = (H32.a) objQ;
        if (aVar != null) {
            return P10.a(aVar);
        }
        c7938z0.d = null;
        c7938z0.n = 3;
        objK = abstractC6048q1.k(c7938z0);
        if (objK != mn) {
            return mn;
        }
        return objK;
        C3735fC1 c3735fC1 = new C3735fC1(new C7728y0((InterfaceC6396rf0) objQ, null, abstractC6048q0, i11, interfaceC7722xy1, cVar2, function2, c3027bp1, interfaceC1138Hj1));
        c7938z0.d = abstractC6048q0;
        c7938z0.e = null;
        c7938z0.g = null;
        c7938z0.h = null;
        c7938z0.i = null;
        c7938z0.j = null;
        c7938z0.k = null;
        c7938z0.n = 2;
        objQ = C4466ii.q(c3735fC1, c7938z0);
        if (objQ != mn) {
            abstractC6048q1 = abstractC6048q0;
            aVar = (H32.a) objQ;
            if (aVar != null) {
                return P10.a(aVar);
            }
            c7938z0.d = null;
            c7938z0.n = 3;
            objK = abstractC6048q1.k(c7938z0);
            if (objK != mn) {
                return objK;
            }
        }
        return mn;
    }
}
