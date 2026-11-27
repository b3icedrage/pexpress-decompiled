package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class RP1 {

    public static class a extends RP1 {
        public volatile boolean a;

        public final void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
