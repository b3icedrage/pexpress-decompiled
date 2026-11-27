package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.response.Response;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: zr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8122zr1 extends ML0 implements Function0<LiveData<C4705jd<Response>>> {
    public final /* synthetic */ C1007Fr1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122zr1(C1007Fr1 c1007Fr1, String str, String str2, String str3) {
        super(0);
        this.d = c1007Fr1;
        this.e = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveData<C4705jd<Response>> invoke() {
        C1007Fr1 c1007Fr1 = this.d;
        String str = (String) StringsKt__StringsKt.split$default(this.g, new String[]{"."}, false, 0, 6, null).get(0);
        String str2 = this.h;
        return c1007Fr1.c.a(this.e, str, str2);
    }
}
