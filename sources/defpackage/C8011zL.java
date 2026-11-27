package defpackage;

import com.jivosite.sdk.model.repository.contacts.ContactForm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8011zL extends ML0 implements Function1<CL, CL> {
    public final /* synthetic */ ContactForm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8011zL(ContactForm contactForm) {
        super(1);
        this.d = contactForm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CL invoke(CL cl) {
        ContactForm contactForm;
        CL state = cl;
        Intrinsics.checkNotNullParameter(state, "state");
        ContactForm contactForm2 = state.b;
        if (contactForm2 != null) {
            ContactForm contactForm3 = this.d;
            String name = contactForm3.a;
            Intrinsics.checkNotNullParameter(name, "name");
            String phone = contactForm3.b;
            Intrinsics.checkNotNullParameter(phone, "phone");
            String email = contactForm3.c;
            Intrinsics.checkNotNullParameter(email, "email");
            contactForm = new ContactForm(contactForm2.d, name, phone, email);
        } else {
            contactForm = null;
        }
        return new CL(true, contactForm);
    }
}
