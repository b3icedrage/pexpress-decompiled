package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ia2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4438ia2 extends ML0 implements Function1<C3179ca2, C3179ca2> {
    public final /* synthetic */ C1351Kc0 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4438ia2(C1351Kc0 c1351Kc0, long j) {
        super(1);
        this.d = c1351Kc0;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3179ca2 invoke(C3179ca2 c3179ca2) {
        C3179ca2 state = c3179ca2;
        Intrinsics.checkNotNullParameter(state, "state");
        HashMap files = new HashMap();
        files.putAll(state.a);
        boolean zIsEmpty = files.isEmpty();
        C1351Kc0 c1351Kc0 = this.d;
        long j = this.e;
        String str = c1351Kc0.d;
        String str2 = c1351Kc0.b;
        if (zIsEmpty) {
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            AbstractC5539na2.b bVar = new AbstractC5539na2.b(j);
            long j2 = c1351Kc0.g;
            String str3 = c1351Kc0.a;
            String str4 = c1351Kc0.f;
            files.put(str4, new C2980bd0(str3, str2, j2, str4, jCurrentTimeMillis, bVar, str));
        } else {
            for (Map.Entry entry : files.entrySet()) {
                String str5 = (String) entry.getKey();
                C2980bd0 c2980bd0 = (C2980bd0) entry.getValue();
                String str6 = c1351Kc0.f;
                if (Intrinsics.a(str5, str6)) {
                    files.put(str6, C2980bd0.a(c2980bd0, new AbstractC5539na2.b(j)));
                    break;
                }
                String str7 = str;
                long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                AbstractC5539na2.b bVar2 = new AbstractC5539na2.b(j);
                String str8 = c1351Kc0.a;
                long j3 = c1351Kc0.g;
                String str9 = c1351Kc0.f;
                files.put(str9, new C2980bd0(str8, str2, j3, str9, jCurrentTimeMillis2, bVar2, str7));
                str = str7;
            }
        }
        Intrinsics.checkNotNullParameter(files, "files");
        return new C3179ca2(files);
    }
}
