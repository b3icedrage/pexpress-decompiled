package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class IG1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public interface a {
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.e;
    }

    public final void g(boolean z) {
        this.c = z;
    }

    public final void h(boolean z) {
        this.a = z;
    }

    public final void i(boolean z) {
        this.f = z;
    }

    public final void j(boolean z) {
        this.d = z;
    }

    public final void k(boolean z) {
        this.b = z;
    }

    public final void l(boolean z) {
        this.e = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb.append(this.a);
        sb.append(", showName=");
        sb.append(this.b);
        sb.append(", isEmailRequired=");
        sb.append(this.c);
        sb.append(", showEmail=");
        sb.append(this.d);
        sb.append(", useSentryUser=");
        sb.append(this.e);
        sb.append(", showBranding=");
        return C2983be.b(sb, this.f, ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}");
    }
}
