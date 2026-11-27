package defpackage;

import androidx.annotation.NonNull;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1556Mt extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    /* JADX INFO: renamed from: Mt$a */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = C1556Mt.this.b;
            int i = BottomAppBar.m0;
        }
    }

    public C1556Mt(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.A(this.a));
        floatingActionButton.m(new a(), true);
    }
}
