package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a b = new a();
    public final HashMap a = new HashMap();

    public class a implements com.bumptech.glide.load.data.a.InterfaceC0302a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0302a
        @NonNull
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0302a
        @NonNull
        public final com.bumptech.glide.load.data.a<Object> b(@NonNull Object obj) {
            return new C0303b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$b, reason: collision with other inner class name */
    public static final class C0303b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0303b(@NonNull Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        @NonNull
        public final Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.a
        public final void b() {
        }
    }
}
