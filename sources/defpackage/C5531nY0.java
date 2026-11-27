package defpackage;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: nY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5531nY0 extends ML0 implements Function0<LiveData<C4705jd<Void>>> {
    public final /* synthetic */ C6370rY0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5531nY0(C6370rY0 c6370rY0, String str) {
        super(0);
        this.d = c6370rY0;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveData<C4705jd<Void>> invoke() {
        return this.d.a.b(this.e);
    }
}
