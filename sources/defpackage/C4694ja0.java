package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.jivosite.sdk.model.pojo.rate.RateSettings;
import java.util.List;

/* JADX INFO: renamed from: ja0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4694ja0 implements InterfaceC5056lH, InterfaceC1608Nj0, SB1.a {
    public final /* synthetic */ int d;

    public static String a(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        RateSettings.a aVar;
        switch (this.d) {
            case 2:
                RateSettings rateSettings = ((C1774Pm1) obj).a;
                if (rateSettings == null || (aVar = rateSettings.b) == null) {
                    return null;
                }
                return aVar.d;
            default:
                return (List) SB1.v(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C4904ka0(3));
        }
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return ExecutorsRegistrar.b.get();
    }
}
