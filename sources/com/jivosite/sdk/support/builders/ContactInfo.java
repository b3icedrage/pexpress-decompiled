package com.jivosite.sdk.support.builders;

import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jivosite/sdk/support/builders/ContactInfo;", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ContactInfo {

    @Nullable
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @Nullable
    public final String d;

    public ContactInfo(@Nullable String str, @NotNull String email, @NotNull String phone, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.a = str;
        this.b = email;
        this.c = phone;
        this.d = str2;
    }
}
