package defpackage;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: vP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7182vP implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        int i = C7393wP.e;
        return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
    }
}
