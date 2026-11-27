package defpackage;

import com.api.core.backend.domain.models.responseModels.AccountType;
import com.api.core.backend.domain.models.responseModels.CommonAccount;
import com.api.core.backend.domain.models.responseModels.CommonAccounts;
import com.api.core.backend.domain.models.responseModels.CommonMinMaxBet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class X22 implements U22 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final O3 b;

    @InterfaceC3368dU(c = "com.base.feature.trading.providers.TradingDefaultsProviderBase", f = "TradingDefaultsProviderBase.kt", l = {49}, m = "resolveBetLimit")
    public static final class a extends LM {
        public String d;
        public boolean e;
        public /* synthetic */ Object g;
        public int i;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return X22.this.h(null, false, this);
        }
    }

    public X22(@NotNull C4923kf appData, @NotNull O3 accountModeSelectionUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        this.a = appData;
        this.b = accountModeSelectionUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object e(X22 x22, EnumC4164hF1 enumC4164hF1, LM lm) {
        V22 v22;
        if (lm instanceof V22) {
            v22 = (V22) lm;
            int i = v22.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                v22.h = i - Integer.MIN_VALUE;
            } else {
                v22 = new V22(x22, lm);
            }
        } else {
            v22 = new V22(x22, lm);
        }
        Object objA = v22.e;
        MN mn = MN.d;
        int i2 = v22.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            v22.d = x22;
            v22.h = 1;
            objA = x22.a(enumC4164hF1, v22);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x22 = v22.d;
            C1795Pt1.b(objA);
        }
        double dDoubleValue = ((Number) objA).doubleValue();
        FF ff = (FF) x22.a.b.getValue();
        return new Double(dDoubleValue * (ff != null ? ff.j : 20.0d));
    }

    @Override // defpackage.U22
    @Nullable
    public final Object a(@Nullable EnumC4164hF1 enumC4164hF1, @NotNull LM lm) {
        if (enumC4164hF1 == null) {
            enumC4164hF1 = (EnumC4164hF1) this.b.l().d.getValue();
        }
        return enumC4164hF1 == EnumC4164hF1.h ? h(g(), true, lm) : h(f(), true, lm);
    }

    @Override // defpackage.U22
    @Nullable
    public final Object b(@Nullable EnumC4164hF1 enumC4164hF1, @NotNull LM lm) {
        return e(this, enumC4164hF1, lm);
    }

    @Override // defpackage.U22
    @Nullable
    public final Object c(@Nullable EnumC4164hF1 enumC4164hF1, @NotNull LM lm) {
        return e(this, enumC4164hF1, lm);
    }

    @Override // defpackage.U22
    @Nullable
    public final Object d(@NotNull LM lm) {
        return ((EnumC4164hF1) this.b.l().d.getValue()) == EnumC4164hF1.h ? h(g(), false, lm) : h(f(), false, lm);
    }

    public final String f() {
        String str;
        List<CommonAccount> listA;
        Object next;
        String currency;
        C4923kf c4923kf = this.a;
        CommonAccounts commonAccounts = (CommonAccounts) c4923kf.m.getValue();
        if (commonAccounts != null && (listA = commonAccounts.a()) != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((CommonAccount) next).getType() != AccountType.DEMO);
            CommonAccount commonAccount = (CommonAccount) next;
            if (commonAccount != null && (currency = commonAccount.getCurrency()) != null) {
                String lowerCase = currency.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                    return lowerCase;
                }
            }
        }
        C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
        if (c6945uG == null || (str = c6945uG.h) == null) {
            return null;
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    public final String g() {
        String str;
        C6945uG c6945uG = (C6945uG) this.a.k.getValue();
        if (c6945uG == null || (str = c6945uG.g) == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, boolean z, JM<? super Double> jm) {
        a aVar;
        double min;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.i = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objP = aVar.g;
        MN mn = MN.d;
        int i2 = aVar.i;
        if (i2 == 0) {
            C1795Pt1.b(objP);
            aVar.d = str;
            aVar.e = z;
            aVar.i = 1;
            objP = C4466ii.p(this.a.J, new W22(2, null), aVar);
            if (objP == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = aVar.e;
            str = aVar.d;
            C1795Pt1.b(objP);
        }
        CommonMinMaxBet commonMinMaxBet = (CommonMinMaxBet) ((Map) objP).get(str);
        if (commonMinMaxBet != null) {
            min = z ? commonMinMaxBet.getMin() : commonMinMaxBet.getMax();
        } else {
            min = z ? 1.0d : 10000.0d;
        }
        return new Double(min);
    }
}
