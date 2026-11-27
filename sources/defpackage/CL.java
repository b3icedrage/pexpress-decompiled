package defpackage;

import com.jivosite.sdk.model.repository.contacts.ContactForm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CL {
    public final boolean a;

    @Nullable
    public final ContactForm b;

    public CL() {
        this(false, 3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CL)) {
            return false;
        }
        CL cl = (CL) obj;
        return this.a == cl.a && Intrinsics.a(this.b, cl.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ContactForm contactForm = this.b;
        return i + (contactForm == null ? 0 : contactForm.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ContactFormState(hasSentContactInfo=" + this.a + ", contactForm=" + this.b + ')';
    }

    public /* synthetic */ CL(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (ContactForm) null);
    }

    public CL(boolean z, @Nullable ContactForm contactForm) {
        this.a = z;
        this.b = contactForm;
    }
}
