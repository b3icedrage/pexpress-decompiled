package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import defpackage.C2092To1;
import defpackage.OU0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final C2092To1 a;

    public static final class a implements com.bumptech.glide.load.data.a.InterfaceC0302a<InputStream> {
        public final OU0 a;

        public a(OU0 ou0) {
            this.a = ou0;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0302a
        @NonNull
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0302a
        @NonNull
        public final com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, OU0 ou0) {
        C2092To1 c2092To1 = new C2092To1(inputStream, ou0);
        this.a = c2092To1;
        c2092To1.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    public final InputStream a() {
        C2092To1 c2092To1 = this.a;
        c2092To1.reset();
        return c2092To1;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
        this.a.release();
    }
}
