package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.AS0;
import defpackage.AbstractC4477ik2;
import defpackage.C4736jk2;
import defpackage.InterfaceC5879pA0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC5879pA0<AbstractC4477ik2> {
    static {
        AS0.d("WrkMgrInitializer");
    }

    @Override // defpackage.InterfaceC5879pA0
    @NonNull
    public final List<Class<? extends InterfaceC5879pA0<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.InterfaceC5879pA0
    @NonNull
    public final AbstractC4477ik2 b(@NonNull Context context) {
        AS0.c().getClass();
        C4736jk2.c(context, new a(new a.C0241a()));
        return C4736jk2.b(context);
    }
}
