package hftm.lucabuetzberger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class PrimaryController {

    //region FXML Elements: Search and Filters
    @FXML
    private TextField txtf_bookFilter;
    @FXML
    private ComboBox<String> comboBox_bookFilterAttributes;
    @FXML
    private TextField txtf_movieFilter;
    @FXML
    private ComboBox<String> comboBox_movieFilterAttributes;
    @FXML
    private TextField txtf_gameFilter;
    @FXML
    private ComboBox<String> comboBox_gameFilterAttributes;
    @FXML
    private TextField txtf_tvshowFilter;
    @FXML
    private ComboBox<String> comboBox_tvshowFilterAttributes;
    //endregion

    //region FXML Elements: Book
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> bookTitleColumn;
    @FXML
    private TableColumn<Book, String> bookAuthorColumn;
    @FXML
    private TableColumn<Book, Integer> bookReleaseYearColumn;
    @FXML
    private TableColumn<Book, String> bookGenreColumn;
    @FXML
    private TableColumn<Book, Integer> bookPagesColumn;
    @FXML
    private TableColumn<Book, Integer> bookRatingColumn;
    @FXML
    private Button newBook;
    @FXML
    private Button editBook;
    @FXML
    private Button deleteBook;
    //endregion

    //region FXML Elements: Movie
    @FXML
    private TableView<Movie> movieTable;
    @FXML
    private TableColumn<Movie, String> movieTitleColumn;
    @FXML
    private TableColumn<Movie, String> movieDirectorColumn;
    @FXML
    private TableColumn<Movie, Integer> movieReleaseYearColumn;
    @FXML
    private TableColumn<Movie, String> movieGenreColumn;
    @FXML
    private TableColumn<Movie, Integer> movieLengthColumn;
    @FXML
    private TableColumn<Movie, Integer> movieRatingColumn;
    @FXML
    private Button newMovie;
    @FXML
    private Button editMovie;
    @FXML
    private Button deleteMovie;
    //endregion

    //region FXML Elements: Game
    @FXML
    private TableView<Game> gameTable;
    @FXML
    private TableColumn<Game, String> gameTitleColumn;
    @FXML
    private TableColumn<Game, String> gameDeveloperColumn;
    @FXML
    private TableColumn<Game, Integer> gameReleaseYearColumn;
    @FXML
    private TableColumn<Game, String> gameGenreColumn;
    @FXML
    private TableColumn<Game, Integer> gamePlaytimeColumn;
    @FXML
    private TableColumn<Game, Integer> gameRatingColumn;
    @FXML
    private Button newGame;
    @FXML
    private Button editGame;
    @FXML
    private Button deleteGame;
    //endregion

    //region FXML Elements: TVShow
    @FXML
    private TableView<TVShow> tvshowTable;
    @FXML
    private TableColumn<TVShow, String> tvshowTitleColumn;
    @FXML
    private TableColumn<TVShow, String> tvshowDirectorColumn;
    @FXML
    private TableColumn<TVShow, Integer> tvshowReleaseYearColumn;
    @FXML
    private TableColumn<TVShow, String> tvshowGenreColumn;
    @FXML
    private TableColumn<TVShow, Integer> tvshowEpisodesColumn;
    @FXML
    private TableColumn<TVShow, Integer> tvshowRatingColumn;
    @FXML
    private Button newTVShow;
    @FXML
    private Button editTVShow;
    @FXML
    private Button deleteTVShow;
    //endregion

    @FXML
    public void initialize(){
        //region Initialize tableView, tableColumns: Book
        this.bookTitleColumn.setCellValueFactory(cellData -> cellData.getValue().bookTitleProperty());
        this.bookAuthorColumn.setCellValueFactory(cellData -> cellData.getValue().bookAuthorProperty());
        this.bookReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().bookReleaseYearProperty().asObject());
        this.bookGenreColumn.setCellValueFactory(cellData -> cellData.getValue().bookGenreProperty());
        this.bookPagesColumn.setCellValueFactory(cellData -> cellData.getValue().bookPagesProperty().asObject());
        this.bookRatingColumn.setCellValueFactory(cellData -> cellData.getValue().bookRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.bookTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.getBookDetails(newValue));
        this.bookTable.setItems(App.getBookList());
        //endregion

        //region Initialize tableView, tableColumns: Movie
        this.movieTitleColumn.setCellValueFactory(cellData -> cellData.getValue().movieTitleProperty());
        this.movieDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().movieDirectorProperty());
        this.movieReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().movieReleaseYearProperty().asObject());
        this.movieGenreColumn.setCellValueFactory(cellData -> cellData.getValue().movieGenreProperty());
        this.movieLengthColumn.setCellValueFactory(cellData -> cellData.getValue().movieLengthProperty().asObject());
        this.movieRatingColumn.setCellValueFactory(cellData -> cellData.getValue().movieRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.movieTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.getMovieDetails(newValue));
        this.movieTable.setItems(App.getMovieList());
        //endregion

        //region Initialize tableView, tableColumns: Game
        this.gameTitleColumn.setCellValueFactory(cellData -> cellData.getValue().gameTitleProperty());
        this.gameDeveloperColumn.setCellValueFactory(cellData -> cellData.getValue().gameDeveloperProperty());
        this.gameReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().gameReleaseYearProperty().asObject());
        this.gameGenreColumn.setCellValueFactory(cellData -> cellData.getValue().gameGenreProperty());
        this.gamePlaytimeColumn.setCellValueFactory(cellData -> cellData.getValue().gamePlaytimeProperty().asObject());
        this.gameRatingColumn.setCellValueFactory(cellData -> cellData.getValue().gameRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.gameTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.getGameDetails(newValue));
        this.gameTable.setItems(App.getGameList());
        //endregion

        //region Initialize tableView, tableColumns: TVShow
        this.tvshowTitleColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowTitleProperty());
        this.tvshowDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowDirectorProperty());
        this.tvshowReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowReleaseYearProperty().asObject());
        this.tvshowGenreColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowGenreProperty());
        this.tvshowEpisodesColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowEpisodesProperty().asObject());
        this.tvshowRatingColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.tvshowTable.getSelectionModel().selectedItemProperty()
//              .addListener((observable, oldValue, newValue) -> this.showTVShowDetails(newValue));
        this.tvshowTable.setItems(App.getTVShowList());
        //endregion

        //region Initialize Listener editButton: Book
        bookTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Book is selected, enable the editBook button
                editBook.setDisable(false);
            } else {
                // No book is selected, disable the editBook button
                editBook.setDisable(true);
            }
        });
        //endregion

        //region Initialize Listener editButton: Movie
        movieTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //Movie is selected, enable the editMovie button
                editMovie.setDisable(false);
            } else {
                //No movie is selected, disable the editMovie button
                editMovie.setDisable(true);
            }
        });
        //endregion

        //region Initialize Listener editButton: Game
        gameTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //Game is selected, enable the editGame button
                editGame.setDisable(false);
            } else {
                //No game is selected, disable the editGame button
                editGame.setDisable(true);
            }
        });
        //endregion

        //region Initialize Listener editButton: TVShow
        tvshowTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //TVShow is selected, enable the editTVShow button
                editTVShow.setDisable(false);
            } else {
                //No tvshow is selected, disable the editTVShow button
                editTVShow.setDisable(true);
            }
        });
        //endregion

        //region Initialize Filter, Search: Book
        //Populate the filterComboBox
        comboBox_bookFilterAttributes.getItems().addAll("All Attributes", "Title", "Author", "Release Year", "Genre", "Pages", "Rating");
        //Set the default selection
        comboBox_bookFilterAttributes.setValue("All Attributes");
        //Add listeners to both txtf_bookFilter and filterComboBox
        txtf_bookFilter.textProperty().addListener((observable, oldValue, newValue) -> filterBookList());
        comboBox_bookFilterAttributes.valueProperty().addListener((observable, oldValue, newValue) -> filterBookList());
        //Set initial values
        bookTable.setItems(App.getBookList());
        //endregion

        //region Initialize Filter, Search: Movie
        //Populate the filterComboBox
        comboBox_movieFilterAttributes.getItems().addAll("All Attributes", "Title", "Director", "Release Year", "Genre", "Length", "Rating");
        //Set the default selection
        comboBox_movieFilterAttributes.setValue("All Attributes");
        //Add listeners to both txtf_bookFilter and filterComboBox
        txtf_movieFilter.textProperty().addListener((observable, oldValue, newValue) -> filterMovieList());
        comboBox_movieFilterAttributes.valueProperty().addListener((observable, oldValue, newValue) -> filterMovieList());
        //Set initial values
        movieTable.setItems(App.getMovieList());
        //endregion

        //region Initialize Filter, Search: Game
        //Populate the filterComboBox
        comboBox_gameFilterAttributes.getItems().addAll("All Attributes", "Title", "Developer", "Release Year", "Genre", "Playtime", "Rating");
        //Set the default selection
        comboBox_gameFilterAttributes.setValue("All Attributes");
        //Add listeners to both txtf_bookFilter and filterComboBox
        txtf_gameFilter.textProperty().addListener((observable, oldValue, newValue) -> filterGameList());
        comboBox_gameFilterAttributes.valueProperty().addListener((observable, oldValue, newValue) -> filterGameList());
        //Set initial values
        gameTable.setItems(App.getGameList());
        //endregion

        //region Initialize Filter, Search: TVSeries
        //Populate the filterComboBox
        comboBox_tvshowFilterAttributes.getItems().addAll("All Attributes", "Title", "Director", "Release Year", "Genre", "Episodes", "Rating");
        //Set the default selection
        comboBox_tvshowFilterAttributes.setValue("All Attributes");
        //Add listeners to both txtf_bookFilter and filterComboBox
        txtf_tvshowFilter.textProperty().addListener((observable, oldValue, newValue) -> filterTVShowList());
        comboBox_tvshowFilterAttributes.valueProperty().addListener((observable, oldValue, newValue) -> filterTVShowList());
        //Set initial values
        tvshowTable.setItems(App.getTVShowList());
        //endregion
    }

    //region Filter, Search: Book
    @FXML
    private void filterBookList() {
        String filterText = txtf_bookFilter.getText().toLowerCase();
        String selectedAttribute = comboBox_bookFilterAttributes.getValue();

        //Clear the current selection in the table
        bookTable.getSelectionModel().clearSelection();

        //Clear the filter if the text field is empty or no attribute is selected
        if (filterText.isEmpty() || selectedAttribute == null) {
            bookTable.setItems(App.getBookList());
            return;
        }

        ObservableList<Book> filteredList = FXCollections.observableArrayList();
        for (Book book : App.getBookList()) {
            String attributeValue = "";

            //Determine the value of the selected attribute
            if (selectedAttribute.equals("All Attributes")) {
                attributeValue = book.getBookAttributes().toLowerCase();
            } else if (selectedAttribute.equals("Title")) {
                attributeValue = book.getBookTitle().toLowerCase();
            } else if (selectedAttribute.equals("Author")) {
                attributeValue = book.getBookAuthor().toLowerCase();
            } else if (selectedAttribute.equals("Release Year")) {
                attributeValue = String.valueOf(book.getBookReleaseYear());
            } else if (selectedAttribute.equals("Genre")) {
                attributeValue = book.getBookGenre().toLowerCase();
            } else if (selectedAttribute.equals("Pages")) {
                attributeValue = String.valueOf(book.getBookPages());
            } else if (selectedAttribute.equals("Rating")) {
                attributeValue = String.valueOf(book.getBookRating());
            }
            //Filter the list based on the selected attribute
            if (attributeValue.contains(filterText)) {
                filteredList.add(book);
            }
        }
        bookTable.setItems(filteredList);
    }
    //endregion

    //region Filter, Search: Movie
    @FXML
    private void filterMovieList() {
        String filterText = txtf_movieFilter.getText().toLowerCase();
        String selectedAttribute = comboBox_movieFilterAttributes.getValue();

        //Clear the current selection in the table
        movieTable.getSelectionModel().clearSelection();

        //Clear the filter if the text field is empty or no attribute is selected
        if (filterText.isEmpty() || selectedAttribute == null) {
            movieTable.setItems(App.getMovieList());
            return;
        }

        ObservableList<Movie> filteredList = FXCollections.observableArrayList();
        for (Movie movie : App.getMovieList()) {
            String attributeValue = "";

            //Determine the value of the selected attribute
            if (selectedAttribute.equals("All Attributes")) {
                attributeValue = movie.getMovieAttributes().toLowerCase();
            } else if (selectedAttribute.equals("Title")) {
                attributeValue = movie.getMovieTitle().toLowerCase();
            } else if (selectedAttribute.equals("Director")) {
                attributeValue = movie.getMovieDirector().toLowerCase();
            } else if (selectedAttribute.equals("Release Year")) {
                attributeValue = String.valueOf(movie.getMovieReleaseYear());
            } else if (selectedAttribute.equals("Genre")) {
                attributeValue = movie.getMovieGenre().toLowerCase();
            } else if (selectedAttribute.equals("Length")) {
                attributeValue = String.valueOf(movie.getMovieLength());
            } else if (selectedAttribute.equals("Rating")) {
                attributeValue = String.valueOf(movie.getMovieRating());
            }
            //Filter the list based on the selected attribute
            if (attributeValue.contains(filterText)) {
                filteredList.add(movie);
            }
        }
        movieTable.setItems(filteredList);
    }
    //endregion

    //region Filter, Search: Game
    @FXML
    private void filterGameList() {
        String filterText = txtf_gameFilter.getText().toLowerCase();
        String selectedAttribute = comboBox_gameFilterAttributes.getValue();

        //Clear the current selection in the table
        gameTable.getSelectionModel().clearSelection();

        //Clear the filter if the text field is empty or no attribute is selected
        if (filterText.isEmpty() || selectedAttribute == null) {
            gameTable.setItems(App.getGameList());
            return;
        }

        ObservableList<Game> filteredList = FXCollections.observableArrayList();
        for (Game game : App.getGameList()) {
            String attributeValue = "";

            //Determine the value of the selected attribute
            if (selectedAttribute.equals("All Attributes")) {
                attributeValue = game.getGameAttributes().toLowerCase();
            } else if (selectedAttribute.equals("Title")) {
                attributeValue = game.getGameTitle().toLowerCase();
            } else if (selectedAttribute.equals("Author")) {
                attributeValue = game.getGameDeveloper().toLowerCase();
            } else if (selectedAttribute.equals("Release Year")) {
                attributeValue = String.valueOf(game.getGameReleaseYear());
            } else if (selectedAttribute.equals("Genre")) {
                attributeValue = game.getGameGenre().toLowerCase();
            } else if (selectedAttribute.equals("Pages")) {
                attributeValue = String.valueOf(game.getGamePlaytime());
            } else if (selectedAttribute.equals("Rating")) {
                attributeValue = String.valueOf(game.getGameRating());
            }
            //Filter the list based on the selected attribute
            if (attributeValue.contains(filterText)) {
                filteredList.add(game);
            }
        }
        gameTable.setItems(filteredList);
    }
    //endregion

    //region Filter, Search: TVSeries
    @FXML
    private void filterTVShowList() {
        String filterText = txtf_tvshowFilter.getText().toLowerCase();
        String selectedAttribute = comboBox_tvshowFilterAttributes.getValue();

        //Clear the current selection in the table
        tvshowTable.getSelectionModel().clearSelection();

        //Clear the filter if the text field is empty or no attribute is selected
        if (filterText.isEmpty() || selectedAttribute == null) {
            tvshowTable.setItems(App.getTVShowList());
            return;
        }

        ObservableList<TVShow> filteredList = FXCollections.observableArrayList();
        for (TVShow tvshow : App.getTVShowList()) {
            String attributeValue = "";

            //Determine the value of the selected attribute
            if (selectedAttribute.equals("All Attributes")) {
                attributeValue = tvshow.getTVShowAttributes().toLowerCase();
            } else if (selectedAttribute.equals("Title")) {
                attributeValue = tvshow.getTVShowTitle().toLowerCase();
            } else if (selectedAttribute.equals("Author")) {
                attributeValue = tvshow.getTVShowDirector().toLowerCase();
            } else if (selectedAttribute.equals("Release Year")) {
                attributeValue = String.valueOf(tvshow.getTVShowReleaseYear());
            } else if (selectedAttribute.equals("Genre")) {
                attributeValue = tvshow.getTVShowGenre().toLowerCase();
            } else if (selectedAttribute.equals("Pages")) {
                attributeValue = String.valueOf(tvshow.getTVShowEpisodes());
            } else if (selectedAttribute.equals("Rating")) {
                attributeValue = String.valueOf(tvshow.getTVShowRating());
            }
            //Filter the list based on the selected attribute
            if (attributeValue.contains(filterText)) {
                filteredList.add(tvshow);
            }
        }
        tvshowTable.setItems(filteredList);
    }
    //endregion

    //region Buttons: Book
    @FXML
    private void newBook() {
        App.switchToNewBookView();
    }

    @FXML
    private void editBook() {
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null){
            App.switchToBookEditView(selectedBook);
        } else {
            System.out.println("No book selected");
        }
    }

    @FXML
    private void deleteBook(){
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null){
            ObservableList<Book> bookList = App.getBookList();
            bookTable.getItems().remove(selectedBook);
            bookList.remove(selectedBook);
            System.out.println("Books in bookList:");
            for (Book book : bookList) {
                System.out.println(book.getBookTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //region Buttons: Movie
    @FXML
    private void newMovie(){
        App.switchToNewMovieView();
    }

    @FXML
    private void editMovie(){
        Movie selectedMovie = movieTable.getSelectionModel().getSelectedItem();
        if (selectedMovie != null){
            App.switchToMovieEditView(selectedMovie);
        } else {
            System.out.println("No movie selected");
        }
    }

    @FXML
    private void deleteMovie(){
        Movie selectedMovie = movieTable.getSelectionModel().getSelectedItem();
        if (selectedMovie != null){
            ObservableList<Movie> movieList = App.getMovieList();
            movieTable.getItems().remove(selectedMovie);
            movieList.remove(selectedMovie);
            System.out.println("Movies in movieList:");
            for (Movie movie : movieList) {
                System.out.println(movie.getMovieTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //region Buttons: Game
    @FXML
    private void newGame(){
        App.switchToNewGameView();
    }

    @FXML
    private void editGame(){
        Game selectedGame = gameTable.getSelectionModel().getSelectedItem();
        if (selectedGame != null){
            App.switchToGameEditView(selectedGame);
        } else {
            System.out.println("No game selected");
        }
    }

    @FXML
    private void deleteGame(){
        Game selectedGame = gameTable.getSelectionModel().getSelectedItem();
        if (selectedGame != null){
            ObservableList<Game> gameList = App.getGameList();
            gameTable.getItems().remove(selectedGame);
            gameList.remove(selectedGame);
            System.out.println("Games in gameList:");
            for (Game game : gameList) {
                System.out.println(game.getGameTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //region Buttons: TVShow
    @FXML
    private void newTVShow(){
        App.switchToNewTVShowView();
    }

    @FXML
    private void editTVShow(){
        TVShow selectedTVShow = tvshowTable.getSelectionModel().getSelectedItem();
        if (selectedTVShow != null){
            App.switchToTVShowEditView(selectedTVShow);
        } else {
            System.out.println("No tvshow selected");
        }
    }

    @FXML
    private void deleteTVShow(){
        TVShow selectedTVShow = tvshowTable.getSelectionModel().getSelectedItem();
        if (selectedTVShow != null){
            ObservableList<TVShow> tvshowList = App.getTVShowList();
            tvshowTable.getItems().remove(selectedTVShow);
            tvshowList.remove(selectedTVShow);
            System.out.println("TVShows in tvshowList:");
            for (TVShow tvshow : tvshowList) {
                System.out.println(tvshow.getTVShowTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //OLD Book Methods
//    private void getBookDetails(Book book) {
//        if (book != null) {
//            // Fill the labels with info from the book object.
//            this.txtf_bookTitle.setText(book.getBookTitle());
//            this.txtf_bookAuthor.setText(book.getBookAuthor());
//            this.txtf_bookReleaseYear.setText(String.valueOf(book.getBookReleaseYear()));
//            this.txtf_bookPages.setText(String.valueOf(book.getBookPages()));
//            this.txtf_bookRating.setText(String.valueOf(book.getBookRating()));
//        } else {
//            // book is null, remove all the text.
//            txtf_bookTitle.setText("");
//            txtf_bookAuthor.setText("");
//            txtf_bookPages.setText("");
//            txtf_bookRating.setText("");
//        }
//    }
}
