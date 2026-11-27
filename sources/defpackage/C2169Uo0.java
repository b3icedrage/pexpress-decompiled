package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.history.HistoryResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Uo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2169Uo0 extends ML0 implements Function0<LiveData<C4705jd<HistoryResult>>> {
    public final /* synthetic */ C2511Yo0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2169Uo0(C2511Yo0 c2511Yo0, String str, long j, String str2) {
        super(0);
        this.d = c2511Yo0;
        this.e = str;
        this.g = j;
        this.h = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveData<C4705jd<HistoryResult>> invoke() {
        return this.d.c.b(this.e, this.g, this.h);
    }
}
