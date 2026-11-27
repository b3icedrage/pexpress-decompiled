package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonBalances;
import com.api.core.backend.domain.models.responseModels.CommonUpdateBalances;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: xi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7670xi1<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C7039ui1 d;

    public C7670xi1(C7039ui1 c7039ui1) {
        this.d = c7039ui1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        Object value;
        C6945uG c6945uG;
        Object value2;
        C6945uG c6945uG2;
        List<CommonBalances.AccountBalance> listA = ((CommonUpdateBalances) ((ResultOk) obj).a()).a();
        C7039ui1 c7039ui1 = this.d;
        c7039ui1.getClass();
        for (CommonBalances.AccountBalance accountBalance : listA) {
            int i = C7039ui1.a.a[accountBalance.getType().ordinal()];
            C4923kf c4923kf = c7039ui1.a;
            if (i == 1) {
                GP1 gp1 = c4923kf.k;
                do {
                    value2 = gp1.getValue();
                    c6945uG2 = (C6945uG) value2;
                } while (!gp1.d(value2, c6945uG2 != null ? C6945uG.a(c6945uG2, null, null, null, accountBalance.getAmount(), 0.0d, accountBalance.getId(), 0L, 259583) : null));
            } else {
                if (i != 2) {
                    throw new C6489s51();
                }
                GP1 gp2 = c4923kf.k;
                do {
                    value = gp2.getValue();
                    c6945uG = (C6945uG) value;
                } while (!gp2.d(value, c6945uG != null ? C6945uG.a(c6945uG, null, null, null, 0.0d, accountBalance.getAmount(), 0L, accountBalance.getId(), 257023) : null));
            }
        }
        return Unit.a;
    }
}
