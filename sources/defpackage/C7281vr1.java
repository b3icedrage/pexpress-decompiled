package defpackage;

import android.app.RemoteInput;

/* JADX INFO: renamed from: vr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7281vr1 {

    /* JADX INFO: renamed from: vr1$a */
    public static class a {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }
}
