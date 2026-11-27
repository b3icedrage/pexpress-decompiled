package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TF0 extends ML0 implements Function1<String, Unit> {
    public final /* synthetic */ SF0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TF0(SF0 sf0, String str, String str2) {
        super(1);
        this.d = sf0;
        this.e = str;
        this.g = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String data = str;
        Intrinsics.checkNotNullParameter(data, "url");
        SF0 sf0 = this.d;
        sf0.n.c(this.e);
        String type = this.g;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        sf0.n(new ClientMessage(string, System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), type, data, TZ0.c.a));
        return Unit.a;
    }
}
