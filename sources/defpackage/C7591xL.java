package defpackage;

import com.jivosite.sdk.model.repository.contacts.ContactForm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7591xL extends ML0 implements Function1<CL, CL> {
    public static final C7591xL d = new C7591xL(1);

    @Override // kotlin.jvm.functions.Function1
    public final CL invoke(CL cl) {
        CL state = cl;
        Intrinsics.checkNotNullParameter(state, "state");
        return new CL(state.a, new ContactForm(null, null, null, 0L, 15, null));
    }
}
