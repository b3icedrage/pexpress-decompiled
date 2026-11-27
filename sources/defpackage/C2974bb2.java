package defpackage;

import com.impl.core.backend.responseModels.Deposit;
import com.impl.core.backend.responseModels.DepositHistoryResponse;
import com.impl.core.backend.responseModels.DepositStatus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: renamed from: bb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl$fetchDepositList$2", f = "UserDataSourceImpl.kt", l = {117}, m = "invokeSuspend")
public final class C2974bb2 extends AW1 implements Function1<JM<? super DepositHistoryResponse>, Object> {
    public int d;
    public final /* synthetic */ C2750ab2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2974bb2(C2750ab2 c2750ab2, JM<? super C2974bb2> jm) {
        super(1, jm);
        this.e = c2750ab2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2974bb2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super DepositHistoryResponse> jm) {
        return ((C2974bb2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objH;
        String strA;
        String strM;
        Double d;
        boolean z = true;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C2750ab2 c2750ab2 = this.e;
            InterfaceC7864ye1 interfaceC7864ye1 = c2750ab2.e;
            String strG = c2750ab2.f.g();
            StringBuilder sb = new StringBuilder("lang=en; ");
            NX nx = c2750ab2.d;
            FF ff = (FF) nx.a.b.getValue();
            if (ff != null) {
                sb.append(ff.e.concat("; "));
            }
            String str = (String) nx.b.o().d.getValue();
            if (str != null && (strA = C2884b82.a(str)) != null && (strM = d.m(strA, "+", "%20")) != null) {
                sb.append("ci_session=" + strM + "; ");
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = StringsKt.d0(string).toString();
            this.d = 1;
            objH = interfaceC7864ye1.h(strG, string2, "375", this);
            if (objH == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            objH = obj;
        }
        AbstractC1091Gt1 abstractC1091Gt1 = (AbstractC1091Gt1) objH;
        Intrinsics.checkNotNullParameter(abstractC1091Gt1, "<this>");
        InputStream inputStreamR1 = abstractC1091Gt1.k().r1();
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamR1, Charsets.UTF_8), 8192);
            try {
                Iterator it = C0648Bc.h(bufferedReader).iterator();
                while (it.hasNext()) {
                    String string3 = StringsKt.d0((String) it.next()).toString();
                    boolean z2 = z;
                    if (d.o(string3, "<td><span class=\"adaptive-label\">Status</span><div class=\"label label-success\">", false)) {
                        C1874Qu.f(arrayList, string3, "<td><span class=\"adaptive-label\">Status</span><div class=\"label label-success\">", "</div></td>");
                    } else if (d.o(string3, "<td><span class=\"adaptive-label\">Status</span><div class=\"label label-warning\">", false)) {
                        C1874Qu.f(arrayList, string3, "<td><span class=\"adaptive-label\">Status</span><div class=\"label label-warning\">", "</div></td>");
                    } else if (d.o(string3, "<td><span class=\"adaptive-label\">Status</span><div class=\"label label-danger\">", false)) {
                        C1874Qu.f(arrayList, string3, "<td><span class=\"adaptive-label\">Status</span><div class=\"label label-danger\">", "</div></td>");
                    } else if (d.o(string3, "<td><span class=\"adaptive-label\">Amount</span>", false)) {
                        C1874Qu.f(arrayList2, string3, "<td><span class=\"adaptive-label\">Amount</span>", "</td>");
                    } else if (d.o(string3, "<span class=\"adaptive-label\">Date</span>", false)) {
                        C1874Qu.f(arrayList3, string3, "<span class=\"adaptive-label\">Date</span>", "</td>");
                    }
                    z = z2;
                }
                Unit unit = Unit.a;
                bufferedReader.close();
                CQ0 cq0B = VE.b();
                int iE = WE.e(arrayList2);
                if (iE >= 0) {
                    int i2 = 0;
                    while (true) {
                        String str2 = (String) CollectionsKt.H(i2, arrayList2);
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            int length = str2.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                char cCharAt = str2.charAt(i3);
                                if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == ',') {
                                    sb2.append(cCharAt);
                                }
                            }
                            String string4 = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            if (string4 != null && (d = IS1.d(string4)) != null) {
                                double dDoubleValue = d.doubleValue();
                                String str3 = (String) CollectionsKt.H(i2, arrayList3);
                                if (str3 != null) {
                                    Long lValueOf = null;
                                    try {
                                        C1717Ot1.a aVar = C1717Ot1.e;
                                        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(str3);
                                        if (date != null) {
                                            lValueOf = Long.valueOf(date.getTime());
                                        }
                                    } catch (Throwable th) {
                                        C1717Ot1.a aVar2 = C1717Ot1.e;
                                        C1795Pt1.a(th);
                                    }
                                    if (lValueOf != null) {
                                        long jLongValue = lValueOf.longValue();
                                        String str4 = (String) CollectionsKt.H(i2, arrayList);
                                        if (str4 != null) {
                                            DepositStatus depositStatus = str4.equals("Completed") ? DepositStatus.Success : str4.equals("Pending") ? DepositStatus.Pending : DepositStatus.Expired;
                                            if (depositStatus != null) {
                                                cq0B.add(new Deposit(dDoubleValue, jLongValue, depositStatus));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i2 == iE) {
                            break;
                        }
                        i2++;
                    }
                }
                DepositHistoryResponse depositHistoryResponse = new DepositHistoryResponse(VE.a(cq0B));
                inputStreamR1.close();
                return depositHistoryResponse;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C6621sj.b(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C6621sj.b(inputStreamR1, th4);
                throw th5;
            }
        }
    }
}
