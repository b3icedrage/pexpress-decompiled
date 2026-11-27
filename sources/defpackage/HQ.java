package defpackage;

import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class HQ implements EQ {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final O3 b;

    @NotNull
    public final AbstractC2167Un1 c;

    @NotNull
    public final InterfaceC7816yQ d;

    public HQ(@NotNull C4923kf appDataRepository, @NotNull O3 accountModeSelectionUseCase, @NotNull AbstractC2167Un1 realAccountIdUseCase, @NotNull InterfaceC7816yQ currencyRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(realAccountIdUseCase, "realAccountIdUseCase");
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        this.a = appDataRepository;
        this.b = accountModeSelectionUseCase;
        this.c = realAccountIdUseCase;
        this.d = currencyRepository;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        if (r10 == r1) goto L51;
     */
    /* JADX WARN: Path cross not found for [B:10:0x0024, B:18:0x005c], limit reached: 62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d5 -> B:40:0x00d8). Please report as a decompilation issue!!! */
    @Override // defpackage.EQ
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r9, @org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HQ.a(boolean, LM):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [o60] */
    @Override // defpackage.EQ
    @NotNull
    public final LF b(@Nullable String str) {
        C4923kf c4923kf = this.a;
        FF ff = (FF) c4923kf.b.getValue();
        Object obj = null;
        ?? r1 = ff != null ? ff.r : 0;
        if (r1 == 0) {
            r1 = C5653o60.d;
        }
        EH0 eh0Y = CollectionsKt.y(r1);
        KF kf = (KF) c4923kf.i.getValue();
        Iterable iterable = kf != null ? kf.a : null;
        if (iterable == null) {
            iterable = C5653o60.d;
        }
        EH0 elements = CollectionsKt.y(iterable);
        Intrinsics.checkNotNullParameter(eh0Y, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {eh0Y, elements};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        C2139Ue0.a aVar = new C2139Ue0.a(FH1.c(C1526Mj.i(elements2)));
        while (aVar.hasNext()) {
            Object next = aVar.next();
            if (d.i(((LF) next).b, str)) {
                obj = next;
                break;
            }
        }
        LF lf = (LF) obj;
        if (lf != null) {
            return lf;
        }
        String upperCase = "usd".toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new LF(0, 0, 0, upperCase, "$");
    }

    @Override // defpackage.EQ
    @Nullable
    public final String c(@Nullable String str) {
        return b(str).c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.EQ
    @Nullable
    public final Object d(@NotNull LM lm) {
        GQ gq;
        HQ hq;
        String str;
        String str2;
        if (lm instanceof GQ) {
            gq = (GQ) lm;
            int i = gq.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq.h = i - Integer.MIN_VALUE;
            } else {
                gq = new GQ(this, lm);
            }
        } else {
            gq = new GQ(this, lm);
        }
        Object objO = gq.e;
        MN mn = MN.d;
        int i2 = gq.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<EnumC4164hF1> interfaceC6396rf0K = this.b.k();
            gq.d = this;
            gq.h = 1;
            objO = C4466ii.o(interfaceC6396rf0K, gq);
            if (objO == mn) {
                return mn;
            }
            hq = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hq = gq.d;
            C1795Pt1.b(objO);
        }
        if (objO == EnumC4164hF1.h) {
            C6945uG c6945uG = (C6945uG) hq.a.k.getValue();
            return (c6945uG == null || (str2 = c6945uG.e) == null) ? "$" : str2;
        }
        C6945uG c6945uG2 = (C6945uG) hq.a.k.getValue();
        return (c6945uG2 == null || (str = c6945uG2.f) == null) ? "$" : str;
    }
}
