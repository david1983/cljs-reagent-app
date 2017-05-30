(ns myapp.pages.home)

;; -------------------------
;; Views

(defn home-page []
  [:div [:h2 "Welcome to myapp test"]
   [:div [:a {:href "/about"} "go to about page"]]])

