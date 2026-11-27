package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.media.MediaSignResponse;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: ea2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3598ea2 extends ML0 implements Function0<LiveData<C4705jd<MediaSignResponse>>> {
    public final /* synthetic */ C4228ha2 d;
    public final /* synthetic */ C1351Kc0 e;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3598ea2(C4228ha2 c4228ha2, C1351Kc0 c1351Kc0, long j, String str) {
        super(0);
        this.d = c4228ha2;
        this.e = c1351Kc0;
        this.g = j;
        this.h = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveData<C4705jd<MediaSignResponse>> invoke() {
        C4228ha2 c4228ha2 = this.d;
        InterfaceC4430iY0 interfaceC4430iY0 = c4228ha2.h;
        C1351Kc0 c1351Kc0 = this.e;
        EK1 ek1 = c4228ha2.i;
        ek1.getClass();
        return interfaceC4430iY0.c(c1351Kc0.a, (String) CollectionsKt.F(StringsKt__StringsKt.split$default((String) ek1.b.a(EK1.z[1], ek1), new String[]{"."}, false, 0, 6, null)), this.g, this.h);
    }
}
