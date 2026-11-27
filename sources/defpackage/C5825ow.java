package defpackage;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5825ow implements com.bumptech.glide.load.data.a<ByteBuffer> {
    public final ByteBuffer a;

    /* JADX INFO: renamed from: ow$a */
    public static class a implements com.bumptech.glide.load.data.a.InterfaceC0302a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0302a
        @NonNull
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0302a
        @NonNull
        public final com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new C5825ow(byteBuffer);
        }
    }

    public C5825ow(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
    }
}
