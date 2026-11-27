package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashMap;

/* JADX INFO: renamed from: gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4047gi implements OnSuccessListener {
    public final Object d;

    public C4047gi(C6251qy c6251qy) {
        this.d = c6251qy;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        C1717Ot1.a aVar = C1717Ot1.e;
        ((C6251qy) this.d).resumeWith(obj);
    }

    public C4047gi() {
        this.d = new HashMap(3);
    }
}
