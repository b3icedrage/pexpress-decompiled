package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.config.Config;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: nE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5472nE1 extends ML0 implements Function0<LiveData<C4705jd<Config>>> {
    public final /* synthetic */ C5892pE1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5472nE1(C5892pE1 c5892pE1, String str) {
        super(0);
        this.d = c5892pE1;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveData<C4705jd<Config>> invoke() {
        return this.d.d.a(this.e);
    }
}
