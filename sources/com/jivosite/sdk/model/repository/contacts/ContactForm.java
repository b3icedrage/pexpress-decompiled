package com.jivosite.sdk.model.repository.contacts;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.C1039Gc0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jivosite/sdk/model/repository/contacts/ContactForm;", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ContactForm {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;
    public final long d;

    public ContactForm() {
        this(null, null, null, 0L, 15, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactForm)) {
            return false;
        }
        ContactForm contactForm = (ContactForm) obj;
        return Intrinsics.a(this.a, contactForm.a) && Intrinsics.a(this.b, contactForm.b) && Intrinsics.a(this.c, contactForm.c) && this.d == contactForm.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @NotNull
    public final String toString() {
        return "ContactForm(name=" + this.a + ", phone=" + this.b + ", email=" + this.c + ", timestamp=" + this.d + ')';
    }

    public ContactForm(long j, @NotNull String name, @NotNull String phone, @NotNull String email) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        this.a = name;
        this.b = phone;
        this.c = email;
        this.d = j;
    }

    public /* synthetic */ ContactForm(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 8) != 0 ? System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) : j, (i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
