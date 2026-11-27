package defpackage;

import com.jivosite.sdk.model.repository.contacts.ContactForm;
import com.jivosite.sdk.support.builders.ContactInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AL extends ML0 implements Function1<CL, Unit> {
    public final /* synthetic */ C7801yL d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AL(C7801yL c7801yL) {
        super(1);
        this.d = c7801yL;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CL cl) {
        String str;
        String str2;
        CL state = cl;
        Intrinsics.checkNotNullParameter(state, "state");
        ContactForm contactForm = state.b;
        String str3 = contactForm != null ? contactForm.a : null;
        String str4 = "";
        if (contactForm == null || (str = contactForm.b) == null) {
            str = "";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        ContactForm contactForm2 = state.b;
        if (contactForm2 != null && (str2 = contactForm2.c) != null) {
            str4 = str2;
        }
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        this.d.S(new ContactInfo(str3, str4, str, null));
        return Unit.a;
    }
}
